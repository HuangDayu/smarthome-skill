package cn.huangdayu.smarthome.skill.jsonbean.aligenie.request;

import lombok.Data;

@Data
public class Payload {

	private String accessToken;
	private String attribute;
	private String deviceId;
	private String deviceType;
	private Extensions extensions;
	private String value;


}