package cn.huangdayu.smarthome.skill.jsonbean.mobvoi.response;

import lombok.Data;

@Data
public class MobvoiResponseHeader {
	private String messageId;

	private String name;

	private String namespace;

	private String payloadVersion;

}
