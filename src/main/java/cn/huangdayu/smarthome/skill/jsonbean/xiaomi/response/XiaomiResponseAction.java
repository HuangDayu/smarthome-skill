package cn.huangdayu.smarthome.skill.jsonbean.xiaomi.response;

import java.util.List;

import lombok.Data;

@Data
public class XiaomiResponseAction {
	private int aiid;
	private String description;
	private String did;
	private List<Object> out;
	private int siid;
	private int status;

}