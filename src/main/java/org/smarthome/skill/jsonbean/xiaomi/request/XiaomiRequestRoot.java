package org.smarthome.skill.jsonbean.xiaomi.request;

import java.util.List;

public class XiaomiRequestRoot {
	private XiaomiRequestAction action;
	private List<Object> devices;
	private String intent;
	private List<XiaomiRequestProperty> properties;
	private String requestId;

	public XiaomiRequestAction getAction() {
		return action;
	}

	public void setAction(XiaomiRequestAction action) {
		this.action = action;
	}

	public List<Object> getDevices() {
		return devices;
	}

	public void setDevices(List<Object> devices) {
		this.devices = devices;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public List<XiaomiRequestProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<XiaomiRequestProperty> properties) {
		this.properties = properties;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
