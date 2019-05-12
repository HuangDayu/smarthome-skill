package cn.huangdayu.smarthome.skill.jsonbean.xiaomi.request;

import lombok.Data;

@Data
public class XiaomiRequestDevice {
	private String description;
	private String did;
	private String name;
	private boolean online;
	private int status;
	private String subscriptionId;
	private String type;

}