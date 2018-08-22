package com.skill.dueros.response;

public class DuerOSResponseRoot {
	private DuerOSResponseHeader header;

	private DuerOSResponsePayload payload;

	public void setHeader(DuerOSResponseHeader header) {
		this.header = header;
	}

	public DuerOSResponseHeader getHeader() {
		return this.header;
	}

	public void setPayload(DuerOSResponsePayload payload) {
		this.payload = payload;
	}

	public DuerOSResponsePayload getPayload() {
		return this.payload;
	}
}
