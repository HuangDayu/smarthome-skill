package cn.huangdayu.smarthome.skill.jsonbean.orion.response;

import java.util.List;

public class OrionResponsePayload {

	private String deviceId;
	private List<OrionResponseDevices> devices;
	private String errorCode;
	private String message;
	private List<OrionResponseProperties> properties;

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDevices(List<OrionResponseDevices> devices) {
		this.devices = devices;
	}

	public List<OrionResponseDevices> getDevices() {
		return devices;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setProperties(List<OrionResponseProperties> properties) {
		this.properties = properties;
	}

	public List<OrionResponseProperties> getProperties() {
		return properties;
	}

}