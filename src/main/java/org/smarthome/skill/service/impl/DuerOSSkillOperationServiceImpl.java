package org.smarthome.skill.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.smarthome.skill.enums.ResultDTO;
import org.smarthome.skill.enums.SkillPlatformEnum;
import org.smarthome.skill.jsonbean.dueros.request.BaiduRequestRoot;
import org.smarthome.skill.service.SkillOperationService;
import org.smarthome.skill.service.SmartHomeSkillService;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;

public class DuerOSSkillOperationServiceImpl implements SkillOperationService {

	public Object skillOperation(SmartHomeSkillService smartHomeSkillService, String json) {
		BaiduRequestRoot baiduRequest = null;
		try {
			// baiduRequest = JSON.parseObject(json, new TypeReference<BaiduRequestRoot>()
			// {});
			baiduRequest = JSONObject.parseObject(json, BaiduRequestRoot.class);
		} catch (Exception e) {
			return ResultDTO.entiey(-5);
		}
		String namespace = baiduRequest.getHeader().getNamespace();
		if (namespace.equals("DuerOS.ConnectedHome.Discovery")) {
			return discovery(json);
		} else if (namespace.equals("DuerOS.ConnectedHome.Control")) {
			return control(json);
		} else {
			return query(json);
		}
	}

	public Object discovery(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object control(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object query(String json) {
		// TODO Auto-generated method stub
		return null;
	}

}
