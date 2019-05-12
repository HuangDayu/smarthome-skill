package cn.huangdayu.smarthome.skill.jsonbean.xiaomi.request;

import lombok.Data;

@Data
public class XiaomiRequestProperty {
	private String did;
	private int piid;
	private int siid;
	private Object value;

}
