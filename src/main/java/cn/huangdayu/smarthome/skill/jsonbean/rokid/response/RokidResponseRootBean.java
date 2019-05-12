package cn.huangdayu.smarthome.skill.jsonbean.rokid.response;

import lombok.Data;

@Data
public class RokidResponseRootBean {
	private RokidResponseEndpoint endpoint;
	private RokidResponseHeader header;
	private RokidResponsePayload payload;

}