package org.smarthome.skill.jsonbean.open.response;

public class OpenResponseRootBean {

	private OpenResponseHeader header;
	private OpenResponsePayload payload;

	public void setHeader(OpenResponseHeader header) {
		this.header = header;
	}

	public OpenResponseHeader getHeader() {
		return header;
	}

	public void setPayload(OpenResponsePayload payload) {
		this.payload = payload;
	}

	public OpenResponsePayload getPayload() {
		return payload;
	}

}