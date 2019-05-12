package cn.huangdayu.smarthome.skill.jsonbean.mobvoi.request;

import lombok.Data;

@Data
public class Header {
	private String messageId;

	private String name;

	private String namespace;

	private String payloadVersion;

}
