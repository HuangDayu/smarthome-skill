package cn.huangdayu.smarthome.skill.jsonbean.rokid.response;

import java.util.List;

import lombok.Data;

@Data
public class RokidResponsePayload {

	private String debugInfo;
	private List<RokidResponseEndpoints> endpoints;
	private String message;
	private String name;
	private String vendorCode;

}