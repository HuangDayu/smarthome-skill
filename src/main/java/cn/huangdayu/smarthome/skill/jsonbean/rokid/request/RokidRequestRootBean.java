package cn.huangdayu.smarthome.skill.jsonbean.rokid.request;

import lombok.Data;

@Data
public class RokidRequestRootBean {

	private Endpoint endpoint;
	private Header header;
	private Payload payload;

}