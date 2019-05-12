package cn.huangdayu.smarthome.skill.jsonbean.open.request;

import lombok.Data;

@Data
public class Payload {

	private String accessToken;
	private String deviceId;
	private String value;

}