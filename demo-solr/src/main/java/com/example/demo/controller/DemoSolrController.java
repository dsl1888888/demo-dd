package com.example.demo.controller;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.annotation.PostConstruct;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/* 类注解 */
@Slf4j
@Api(value = "desc of class")
@RestController
public class DemoSolrController {

	private final static String solrDataName = "demo1";

	@Autowired
	private SolrClient solrClient;

	@PostConstruct
	public void init() {

		try {
			log.info(solrClient.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* 方法注解 */
	@ApiOperation(value = "queryById", notes = "")
	@RequestMapping(value = "demo/solr/queryById", method = RequestMethod.GET)
	public String queryById(String id) {
		String resp = "";
		try {
			SolrQuery query = new SolrQuery();
			// 查询参数q
			query.set("q", "id:" + id);
			query.set("fl", "*");
			// query.set("sort", "sortOrder asc,goodsPrice asc");
			QueryResponse response = solrClient.query(solrDataName, query);
			SolrDocumentList results = response.getResults();
			if (results.getNumFound() == 0) {
				resp = "";
			} else {
				resp = "" + results.get(0).toString();
			}
		} catch (SolrServerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "" + JSON.toJSONString(resp);
	}

	/* 方法注解 */
	@ApiOperation(value = "deteleAll", notes = "")
	@RequestMapping(value = "demo/solr/deteleAll", method = RequestMethod.GET)
	public String deteleAll() {
		try {
			solrClient.deleteByQuery(solrDataName, "*:*");
			solrClient.commit(solrDataName);
		} catch (Exception e) {
			log.error("删除solr数据失败");
		}
		return "{\"msg\":\"success\",\"code\":0}";
	}

	/* 方法注解 */
	@ApiOperation(value = "deteleById", notes = "")
	@RequestMapping(value = "demo/solr/deteleById", method = RequestMethod.GET)
	public String deteleById(String id) {
		try {
			solrClient.deleteByQuery(solrDataName, "id:" + id);
			solrClient.commit(solrDataName);
		} catch (Exception e) {
			log.error("删除solr数据失败");
		}
		return "{\"msg\":\"success\",\"code\":0}";
	}

	/* 方法注解 */
	@ApiOperation(value = "insertBatch", notes = "")
	@RequestMapping(value = "demo/solr/insertBatch", method = RequestMethod.GET)
	public String insertBatch() throws IOException, SolrServerException {

		CopyOnWriteArrayList<SolrInputDocument> docs = new CopyOnWriteArrayList<>();

		for (int i = 0; i < 100; i++) {
			SolrInputDocument doc = new SolrInputDocument();
			String uuid = UUID.randomUUID().toString().replace("-", "");
			doc.setField("id", uuid);
			doc.setField("shopNo", "shopNo" + uuid);
			doc.setField("shopName", "shopName" + uuid);
			doc.setField("details", "details" + uuid);
			docs.add(doc);
		}
		if (docs.size() > 0) {
			solrClient.add(solrDataName, docs);
			solrClient.commit(solrDataName);
		}
		return "{\"msg\":\"success\",\"code\":0}";
	}

	/* 方法注解 */
	@ApiOperation(value = "insertOne", notes = "")
	@RequestMapping(value = "demo/solr/insertOne", method = RequestMethod.GET)
	public String insertOne() throws IOException, SolrServerException {

		CopyOnWriteArrayList<SolrInputDocument> docs = new CopyOnWriteArrayList<>();

		for (int i = 0; i < 1; i++) {
			SolrInputDocument doc = new SolrInputDocument();
			String uuid = UUID.randomUUID().toString().replace("-", "");
			doc.setField("id", uuid);
			doc.setField("shopNo", "shopNo=" + uuid);
			doc.setField("shopName", "shopName=" + uuid);
			doc.setField("details", "details=" + uuid);
			docs.add(doc);
		}
		if (docs.size() > 0) {
			solrClient.add(solrDataName, docs);
			solrClient.commit(solrDataName);
		}

		return "{\"msg\":\"success\",\"code\":0}";
	}
}
