package cn.huangdayu.smarthome.skill.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SkillValueUtil {
	
	public static int getEacheIntValue(Map<String, Object> map, String key) {
		return Integer.parseInt(String.valueOf(map.get(key)));
	}

	public static String getEacheStrValue(Map<String, Object> map, String key) {
		return String.valueOf(map.get(key));
	}
	
	public static String getTime() {
		Date date = new Date();
		// 这是标准的XML Schema的"日期型数据格式”
		// T是代表后面跟着“时间”。Z代表0时区，或者叫UTC统一时间。
		// "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		String str = df.format(date);
		return str;
	}
	public static  String getAirMode(String mode) {
		//0=自动 ，1=制冷， 2=除湿， 3=送风， 4=制热
		if(mode.equals("送风模式")||mode.equals("FAN")||mode.equals("airsupply")||mode.equals("ventilate")) {
			return "airsupply";
		}else if(mode.equals("除湿模式")||mode.equals("DEHUMIDIFICATION")||mode.equals("dehumidification")) {
			return "dehumidification";
		}else if(mode.equals("制冷模式")||mode.equals("COOL")||mode.equals("cold")) {
			return "cold";
		}else if(mode.equals("制热模式")||mode.equals("HEAT")||mode.equals("heat")) {
			return "heat";
		}else {
			return "auto";//默认是自动模式
		}
	}
	
	public static Object jacksonToFastJsonNON_DEFAULT(Object obj) {
		try {
			obj = JSON.parseObject(new ObjectMapper().setSerializationInclusion(Include.NON_DEFAULT)
					.writeValueAsString(obj));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	/**
	 * Object 转 Int
	 * 
	 * @param value
	 * @return
	 */
	public static int objectToInt(Object value) {
		return new Double(String.valueOf(value)).intValue();
	}

}
