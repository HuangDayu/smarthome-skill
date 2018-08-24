package com.skill.rokid.response;

public class RokidResponseRootBean {
	private RokidResponseEndpoint endpoint;
	private RokidResponseHeader header;
	private RokidResponsePayload payload;

	public void setEndpoint(RokidResponseEndpoint endpoint) {
		this.endpoint = endpoint;
	}

	public RokidResponseEndpoint getEndpoint() {
		return endpoint;
	}

	public void setHeader(RokidResponseHeader header) {
		this.header = header;
	}

	public RokidResponseHeader getHeader() {
		return header;
	}

	public void setPayload(RokidResponsePayload payload) {
		this.payload = payload;
	}

	public RokidResponsePayload getPayload() {
		return payload;
	}

}