package com.example.demo.service.impl;

import org.apache.dubbo.config.annotation.DubboService;

import com.example.demo.service.WykjUserIdRemoteService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Administrator
 *
 */
@Slf4j
@DubboService(version = "0.0.1")
public class WykjUserIdRemoteServiceImpl implements WykjUserIdRemoteService {
	@Override
	public String demo() {

		String string = "{\"status\":\"SUCCESS\",\"subCode\":\"200\",\"message\":\"Token generated\",\"data\":{\"token\":\"ab9JCVXpkI6ICc5RnIsICN4MzUIJiOicGbhJye.ab0nIIRVVB9VSQFEVV9UWBBlI6IiY1NnIsQzM5cDNwMjM2EjOiQXYpJCL0MTN4QDMzIjNxojIwhXZiwiI3QjL4gjL5AjMuQTNxIiOiAXaiwSZzxWYmpjIrNWZoNUZyVHdh52ZpNnIskzM2ATO6ICZJRnb192YjFmIsIyRVhETJNVSLhUOLZVRHh0SMVVMDBzN5UjNGNkI6ICZJRnbllGbjJye.abCx8STXnxpSp1tRh47Zoc90THJwGGEbQ7cDu3FyktkaUBe0evxNfdGY-ogoLaBmbZ\",\"expiry\":1623048534}}";

		log.info(string);
		return string;
	}

}