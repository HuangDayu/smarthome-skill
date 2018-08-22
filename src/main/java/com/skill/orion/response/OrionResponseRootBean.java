package com.skill.orion.response;

import java.util.List;

public class OrionResponseRootBean {

	private OrionResponseHeader header;
	private OrionResponsePayload payload;

	public void setHeader(OrionResponseHeader header) {
		this.header = header;
	}

	public OrionResponseHeader getHeader() {
		return header;
	}

	public void setPayload(OrionResponsePayload payload) {
		this.payload = payload;
	}

	public OrionResponsePayload getPayload() {
		return payload;
	}

	private List<OrionResponseProperties> properties;

	public List<OrionResponseProperties> getProperties() {
		return properties;
	}

	public void setProperties(List<OrionResponseProperties> properties) {
		this.properties = properties;
	}

}