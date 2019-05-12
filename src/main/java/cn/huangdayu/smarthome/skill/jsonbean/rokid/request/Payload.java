package cn.huangdayu.smarthome.skill.jsonbean.rokid.request;

import lombok.Data;

@Data
public class Payload {

	private Object delta;
	private Object value;
	private TVChannel tvChannel;

}