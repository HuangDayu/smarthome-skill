package cn.huangdayu.smarthome.skill.jsonbean.open.response;

import lombok.Data;

@Data
public class OpenResponseHeader {

	private String messageId;
	private String name;
	private String namespace;
	private String payloadVersion;

}