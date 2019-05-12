package cn.huangdayu.smarthome.skill.jsonbean.dueros.request;

import lombok.Data;

@Data
public class BaiduRequestHeader {
	private String namespace;

	private String name;

	private String messageId;

	private String payloadVersion;

}
