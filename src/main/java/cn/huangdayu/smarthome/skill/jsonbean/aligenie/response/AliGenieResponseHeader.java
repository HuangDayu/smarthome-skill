package cn.huangdayu.smarthome.skill.jsonbean.aligenie.response;

public class AliGenieResponseHeader {

	private String messageId;
	private String name;
	private String namespace;
	private int payLoadVersion;

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setPayLoadVersion(int payLoadVersion) {
		this.payLoadVersion = payLoadVersion;
	}

	public int getPayLoadVersion() {
		return payLoadVersion;
	}

}