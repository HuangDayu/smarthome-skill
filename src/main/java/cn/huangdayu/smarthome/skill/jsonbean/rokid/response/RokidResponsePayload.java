package cn.huangdayu.smarthome.skill.jsonbean.rokid.response;

import java.util.List;

public class RokidResponsePayload {

	private String debugInfo;
	private List<RokidResponseEndpoints> endpoints;
	private String message;
	private String name;
	private String vendorCode;

	public void setDebugInfo(String debugInfo) {
		this.debugInfo = debugInfo;
	}

	public String getDebugInfo() {
		return debugInfo;
	}

	public void setEndpoints(List<RokidResponseEndpoints> endpoints) {
		this.endpoints = endpoints;
	}

	public List<RokidResponseEndpoints> getEndpoints() {
		return endpoints;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public String getVendorCode() {
		return vendorCode;
	}

}