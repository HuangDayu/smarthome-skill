package com.skill.aligenie.response;

import java.util.List;

public class AliGenieResponseRootBean {

	private AliGenieResponseHeader header;
	private AliGenieResponsePayload payload;

	public void setHeader(AliGenieResponseHeader header) {
		this.header = header;
	}

	public AliGenieResponseHeader getHeader() {
		return header;
	}

	public void setPayload(AliGenieResponsePayload payload) {
		this.payload = payload;
	}

	public AliGenieResponsePayload getPayload() {
		return payload;
	}

	private List<AliGenieResponseProperties> properties;

	public List<AliGenieResponseProperties> getProperties() {
		return properties;
	}

	public void setProperties(List<AliGenieResponseProperties> properties) {
		this.properties = properties;
	}

}