package cn.huangdayu.smarthome.skill.jsonbean.rokid.response;

import lombok.Data;

@Data
public class RokidResponseHeader {

	private String messageId;
	private String name;
	private String namespace;
	private String payloadVersion;

}