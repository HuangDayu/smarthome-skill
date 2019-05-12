package cn.huangdayu.smarthome.skill.jsonbean.dueros.response;

import lombok.Data;

@Data
public class DuerOSResponseHeader {
	private String namespace;

	private String name;

	private String messageId;

	private String payloadVersion;

}
