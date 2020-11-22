package com.example.demo.entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "demo1")
public class Demo
{

    @Id
    @Field
    private String id;
    @Field
    private String userName;
    @Field
    private String sex;
    @Field
    private String address;

}