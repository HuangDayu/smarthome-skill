package cn.huangdayu.smarthome.skill.jsonbean.xiaomi.response;

import lombok.Data;

@Data
public class XiaomiResponseDevice {
	private String description;
	private String did;
	private String name;
	private boolean online;
	private int status;
	private String subscriptionId;
	private String type;

}