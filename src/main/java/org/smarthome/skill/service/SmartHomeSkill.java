package org.smarthome.skill.service;

import org.smarthome.skill.enums.SkillPlatformEnum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

public class SmartHomeSkill {
	private SkillPlatformEnum spEnum;
	private String json;

	/***
	 * 使用序列化后的josn字符串作为参数
	 * 
	 * @param spEnum
	 * @param json
	 */
	public SmartHomeSkill(SkillPlatformEnum spEnum, String json) {
		this.spEnum = spEnum;
		this.json = json;
	}

	/***
	 * 使用HttpServletRequest作为参数（针对使用Servlet实现服务）
	 * 
	 * @param spEnum
	 * @param request
	 * @throws IOException
	 */
	public SmartHomeSkill(SkillPlatformEnum spEnum, HttpServletRequest request) throws IOException {
		StringBuffer stringBuffer = new StringBuffer();
		InputStream inputStream = request.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String st1r = "";
		while ((st1r = bufferedReader.readLine()) != null) {
			stringBuffer.append(st1r);
		}
		String str2 = stringBuffer.toString();
		this.spEnum = spEnum;
		this.json = str2;
	}

	public Object skillOperation() {
		switch (this.getSpEnum()) {
		case BAIDU_DUEROS:// 百度DuerOS

			break;
		case TMALL_ALIGENIE:// 天猫AliGenie

			break;
		case XIAOMI_SKILL:// 小米IOT

			break;
		case ROKID_SKILL:// 若琪Rokid

			break;
		case MOBVOI_SKILL:// 出门问问Mobvoi

			break;
		case LIEBIAO_ORION:// 猎豹Orion

			break;
		case JD_ALPHA:// 京东JDAlpha

			break;
		case SPEECH_DUI:// 思必驰dui

			break;

		default:
			break;
		}
		return null;
	}

	public SkillPlatformEnum getSpEnum() {
		return spEnum;
	}

	public void setSpEnum(SkillPlatformEnum spEnum) {
		this.spEnum = spEnum;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	};
	
}
