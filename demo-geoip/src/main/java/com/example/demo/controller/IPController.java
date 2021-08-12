package com.example.demo.controller;

import java.net.InetAddress;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maxmind.geoip.LookupService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class IPController {

	@RequestMapping(value = "myIp", method = RequestMethod.GET)
	public HashMap IP(HttpServletRequest request) throws Exception {

		String myIp = request.getRemoteAddr();

		HashMap map = new HashMap<>();
		map.put("myIp:", myIp);

		return map;
	}

	@RequestMapping(value = "myIpDetail", method = RequestMethod.GET)
	public HashMap IP(String myIp) throws Exception {
 
//        String geoLiteCityFilePath = Thread.currentThread().getContextClassLoader().getResource("GeoLiteCity.dat")
//                                           .getPath();
//        
		String geoLiteCityFilePath = "/root/GeoLiteCity.dat";
		
		HashMap map = new HashMap<>();
		
		try {
			LookupService lookupService = new LookupService(geoLiteCityFilePath, LookupService.GEOIP_MEMORY_CACHE);
			String ip = myIp;
			InetAddress inetAddress = InetAddress.getByName(ip);
			log.info("areaCode:" + lookupService.getLocation(inetAddress).area_code);
			log.info("city:" + lookupService.getLocation(inetAddress).city);
			log.info("countryCode:" + lookupService.getLocation(inetAddress).countryCode);
			log.info("countryName:" + lookupService.getLocation(inetAddress).countryName);
			log.info("postalCode:" + lookupService.getLocation(inetAddress).postalCode);
			log.info("region:" + lookupService.getLocation(inetAddress).region);
			log.info("dma_code:" + lookupService.getLocation(inetAddress).dma_code);
			log.info("latitude:" + lookupService.getLocation(inetAddress).latitude);
			log.info("longitude:" + lookupService.getLocation(inetAddress).longitude);
			log.info("metro_code:" + lookupService.getLocation(inetAddress).metro_code);
			// ————————————————
			// 版权声明：本文为CSDN博主「Aldom」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
			// 原文链接：https://blog.csdn.net/MichaelJY1991/article/details/50385418

			
			map.put("areaCode:", lookupService.getLocation(inetAddress).area_code);
			map.put("city:", lookupService.getLocation(inetAddress).city);
			map.put("countryCode:", lookupService.getLocation(inetAddress).countryCode);
			map.put("countryName:", lookupService.getLocation(inetAddress).countryName);
			map.put("postalCode:", lookupService.getLocation(inetAddress).postalCode);
			map.put("region:", lookupService.getLocation(inetAddress).region);
			map.put("dma_code:", lookupService.getLocation(inetAddress).dma_code);
			map.put("latitude:", lookupService.getLocation(inetAddress).latitude);
			map.put("longitude:", lookupService.getLocation(inetAddress).longitude);
			map.put("metro_code:", lookupService.getLocation(inetAddress).metro_code);
		} catch (Exception e) {
			map.put("areaCode:", null);
			map.put("city:", null);
			map.put("countryCode:",null);
			map.put("countryName:", null);
			map.put("postalCode:", null);
			map.put("region:", null);
			map.put("dma_code:",null);
			map.put("latitude:",null);
			map.put("longitude:",null);
			map.put("metro_code:",null);
		}

		return map;
	}

}
