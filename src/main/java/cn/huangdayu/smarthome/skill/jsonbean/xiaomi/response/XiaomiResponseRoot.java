package cn.huangdayu.smarthome.skill.jsonbean.xiaomi.response;

import java.util.List;

public class XiaomiResponseRoot {
	private XiaomiResponseAction action;
	private int code;
	private String description;
	private List<XiaomiResponseDevice> devices;
	private String intent;
	private List<XiaomiResponseProperty> properties;
	private String requestId;

	public XiaomiResponseAction getAction() {
		return action;
	}

	public void setAction(XiaomiResponseAction action) {
		this.action = action;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<XiaomiResponseDevice> getDevices() {
		return devices;
	}

	public void setDevices(List<XiaomiResponseDevice> devices) {
		this.devices = devices;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public List<XiaomiResponseProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<XiaomiResponseProperty> properties) {
		this.properties = properties;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	private String topic;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}