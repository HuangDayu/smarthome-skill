package cn.huangdayu.smarthome.skill.jsonbean.xiaomi.response;

import java.util.List;

import lombok.Data;

@Data
public class XiaomiResponseRoot {
	private XiaomiResponseAction action;
	private int code;
	private String description;
	private List<XiaomiResponseDevice> devices;
	private String intent;
	private List<XiaomiResponseProperty> properties;
	private String requestId;

}