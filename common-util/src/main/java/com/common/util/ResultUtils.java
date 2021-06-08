package com.common.util;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
 
/**
 * 结果处理工具类
 *
 * @author syl
 */
public  abstract class ResultUtils {
 
 
 
 
 
    /**
     * 成功 00000
     */
    public static Integer SUCCESS_CODE = 200;
    public static String SUCCESS_MSG = "处理成功";
 
    /**
     * 失败
     * 如果需要特殊的错误代码表示特定的含义 可自行添加
     */
    public static Integer ERROR_CODE = 201;
    public static String ERROR_MSG = "网络错误";
 
 
 
    public static Map<String, Object> success() {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", SUCCESS_CODE);
        resultMap.put("msg", SUCCESS_MSG);
        return resultMap;
    }
 
    public static Map<String,Object> errorCode(Integer code,String msg){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", code);
        resultMap.put("msg", msg);
        return resultMap;
    }
    /**
     * 成功返回  包含返回信息。
     * @param result  需要返回的信息。
     * @return
     */
    public static Map<String, Object> success(Object result) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", SUCCESS_CODE);
        resultMap.put("msg", SUCCESS_MSG);
        resultMap.put("info", result);
        return resultMap;
    }
    public static Map<String, Object> success(List list,int count) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", SUCCESS_CODE);
        resultMap.put("msg", SUCCESS_MSG);
        resultMap.put("info", list);
        resultMap.put("total", count);
        return resultMap;
    }
 
    /**
     *  错误返回标志
     *  例如 ajax请求 失败 直接返回错误。
     * @return
     */
    public static Map<String, Object> fail() {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", ERROR_CODE);
        resultMap.put("msg", ERROR_MSG);
        return resultMap;
    }
 
    /**
     * 错误码+错误信息
     * @param
     * @return
     */
    public static Map<String, Object> fail(String msg) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", ERROR_CODE);
        resultMap.put("msg", msg);
        return resultMap;
    }
    public static Map<String, Object> noFocus(String msg) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", 260);
        resultMap.put("msg", msg);
        return resultMap;
    }
    
    public static Map<String, Object> getResult(String msg) {
		Map<String,Object> map=new HashMap<String,Object>();
		if(StringUtils.isNotBlank(msg)) {
		   String[] result=msg.split("\\\r\\\n");
		   for(String str:result) {
			  String[] arr=str.split("=");
			  map.put(arr[0], arr[1]);
		   }
		}
		return map;
	}
}
