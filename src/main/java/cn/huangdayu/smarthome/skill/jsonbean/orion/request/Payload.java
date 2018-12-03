package cn.huangdayu.smarthome.skill.jsonbean.orion.request;

public class Payload {

	private String accessToken;
	private String attribute;
	private String deviceId;
	private String deviceType;
	private Extensions extensions;
	private String value;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setExtensions(Extensions extensions) {
		this.extensions = extensions;
	}

	public Extensions getExtensions() {
		return extensions;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}