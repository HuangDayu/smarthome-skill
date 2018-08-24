package com.skill.mobvoi.request;

public class MobvoiRequestRoot {
	private Header header;

	private Payload payload;

	public void setHeader(Header header) {
		this.header = header;
	}

	public Header getHeader() {
		return this.header;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	public Payload getPayload() {
		return this.payload;
	}
}
