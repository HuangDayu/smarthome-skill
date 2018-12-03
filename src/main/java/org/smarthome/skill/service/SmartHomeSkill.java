package org.smarthome.skill.service;

import org.apache.commons.lang3.StringUtils;
import org.smarthome.skill.dto.ResultDTO;
import org.smarthome.skill.enums.ResultEnum;
import org.smarthome.skill.enums.SkillPlatformEnum;
import org.smarthome.skill.service.impl.AligenieImpl;
import org.smarthome.skill.service.impl.AlphaImpl;
import org.smarthome.skill.service.impl.DuerOSImpl;
import org.smarthome.skill.service.impl.MobvoiImpl;
import org.smarthome.skill.service.impl.OrionImpl;
import org.smarthome.skill.service.impl.RokidImpl;
import org.smarthome.skill.service.impl.SpeechImpl;
import org.smarthome.skill.service.impl.XiaoMiImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

public class SmartHomeSkill {

	private SmartHomeSkill() {
	};

	/***
	 * 使用序列化后的josn字符串作为参数
	 * 
	 * @param spEnum
	 * @param json
	 */
	public static Object skillOperation(SmartHomeSkillService smartHomeSkillService, SkillPlatformEnum spEnum,
			String json) {
		return skillOperation(spEnum, json, smartHomeSkillService);
	}

	/***
	 * 使用HttpServletRequest作为参数（针对使用Servlet实现服务）
	 * 
	 * @param spEnum
	 * @param request
	 * @throws IOException
	 */
	public static Object skillOperation(SmartHomeSkillService smartHomeSkillService, SkillPlatformEnum spEnum,
			HttpServletRequest request) throws IOException {
		StringBuffer stringBuffer = new StringBuffer();
		InputStream inputStream = request.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String st1r = "";
		while ((st1r = bufferedReader.readLine()) != null) {
			stringBuffer.append(st1r);
		}
		String str2 = stringBuffer.toString();
		return skillOperation(spEnum, str2, smartHomeSkillService);
	}

	public static Object skillOperation(SkillPlatformEnum spEnum, String json, SmartHomeSkillService shss) {
		if (StringUtils.isBlank(json)) {
			return ResultDTO.entiey(-4);
		}
		SkillService skillService = null;
		switch (spEnum) {
		case BAIDU_DUEROS:// 百度DuerOS
			skillService = new DuerOSImpl();
			break;
		case TMALL_ALIGENIE:// 天猫AliGenie
			skillService = new AligenieImpl();
			break;
		case XIAOMI_SKILL:// 小米IOT
			skillService = new XiaoMiImpl();
			break;
		case ROKID_SKILL:// 若琪Rokid
			skillService = new RokidImpl();
			break;
		case MOBVOI_SKILL:// 出门问问Mobvoi
			skillService = new MobvoiImpl();
			break;
		case LIEBIAO_ORION:// 猎豹Orion
			skillService = new OrionImpl();
			break;
		case JD_ALPHA:// 京东JDAlpha
			skillService = new AlphaImpl();
			break;
		case SPEECH_DUI:// 思必驰dui
			skillService = new SpeechImpl();
			break;
		default:
			return ResultDTO.entiey(-5);
		}
		return skillService.skillOperation(shss, json);
	}

}
