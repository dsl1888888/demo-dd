package com.example.demo;

import java.net.InetAddress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maxmind.geoip.LookupService;

/**
 * https://blog.csdn.net/u012702547/article/details/88775298
 */
@SpringBootApplication
public class DemoGeoIPApplication
{

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(DemoGeoIPApplication.class, args);
//        String geoLiteCityFilePath = Thread.currentThread().getContextClassLoader().getResource("GeoLiteCity.dat")
//                .getPath();

        String geoLiteCityFilePath ="/root/GeoLiteCity.dat";
        
        LookupService lookupService = new LookupService(geoLiteCityFilePath, LookupService.GEOIP_MEMORY_CACHE);
        // String ip = "218.28.2.111";
        String ip = "79.141.171.49";
        InetAddress inetAddress = InetAddress.getByName(ip);
        System.out.println("areaCode:" + lookupService.getLocation(inetAddress).area_code);
        System.out.println("city:" + lookupService.getLocation(inetAddress).city);
        System.out.println("countryCode:" + lookupService.getLocation(inetAddress).countryCode);
        System.out.println("countryName:" + lookupService.getLocation(inetAddress).countryName);
        System.out.println("postalCode:" + lookupService.getLocation(inetAddress).postalCode);
        System.out.println("region:" + lookupService.getLocation(inetAddress).region);
        System.out.println("dma_code:" + lookupService.getLocation(inetAddress).dma_code);
        System.out.println("latitude:" + lookupService.getLocation(inetAddress).latitude);
        System.out.println("longitude:" + lookupService.getLocation(inetAddress).longitude);
        System.out.println("metro_code:" + lookupService.getLocation(inetAddress).metro_code);
        // ————————————————
        // 版权声明：本文为CSDN博主「Aldom」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
        // 原文链接：https://blog.csdn.net/MichaelJY1991/article/details/50385418
    }

}
