package com.skill.mobvoi.response;

public class MobvoiResponseQueryRoot {
	private MobvoiResponseHeader header;

	private MobvoiResponseQueryPayload payload;

	public MobvoiResponseHeader getHeader() {
		return header;
	}

	public void setHeader(MobvoiResponseHeader header) {
		this.header = header;
	}

	public MobvoiResponseQueryPayload getPayload() {
		return payload;
	}

	public void setPayload(MobvoiResponseQueryPayload payload) {
		this.payload = payload;
	}

}
