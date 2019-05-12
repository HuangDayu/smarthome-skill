package cn.huangdayu.smarthome.skill.jsonbean.jdalpha.request;

import lombok.Data;

@Data
public class Payload {

	private String accessToken;
	private String deviceId;
	private Extensions extensions;
	private Properties properties;

}