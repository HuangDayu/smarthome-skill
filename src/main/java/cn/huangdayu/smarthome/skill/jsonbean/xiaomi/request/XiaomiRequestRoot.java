package cn.huangdayu.smarthome.skill.jsonbean.xiaomi.request;

import java.util.List;

import lombok.Data;

@Data
public class XiaomiRequestRoot {
	private XiaomiRequestAction action;
	private List<Object> devices;
	private String intent;
	private List<XiaomiRequestProperty> properties;
	private String requestId;

}
