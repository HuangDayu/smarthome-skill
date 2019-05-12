package cn.huangdayu.smarthome.skill.jsonbean.xiaomi.response;

import lombok.Data;

@Data
public class XiaomiResponseProperty {
	private String description;
	private String did;
	private int piid;
	private int siid;
	private int status;
	private Object value;

}