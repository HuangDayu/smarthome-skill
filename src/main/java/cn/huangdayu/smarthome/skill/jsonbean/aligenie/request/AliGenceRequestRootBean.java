package cn.huangdayu.smarthome.skill.jsonbean.aligenie.request;

public class AliGenceRequestRootBean {

	private Header header;
	private Payload payload;

	public void setHeader(Header header) {
		this.header = header;
	}

	public Header getHeader() {
		return header;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	public Payload getPayload() {
		return payload;
	}

}