package cn.huangdayu.smarthome.skill.jsonbean.rokid.request;

import lombok.Data;

@Data
public class Header {

	private Authorization authorization;
	private String messageId;
	private String name;
	private String namespace;
	private String payloadVersion;

}