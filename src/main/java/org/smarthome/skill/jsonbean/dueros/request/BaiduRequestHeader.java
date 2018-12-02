package org.smarthome.skill.jsonbean.dueros.request;

public class BaiduRequestHeader {
	private String namespace;

	private String name;

	private String messageId;

	private String payloadVersion;

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setPayloadVersion(String payloadVersion) {
		this.payloadVersion = payloadVersion;
	}

	public String getPayloadVersion() {
		return this.payloadVersion;
	}
}
