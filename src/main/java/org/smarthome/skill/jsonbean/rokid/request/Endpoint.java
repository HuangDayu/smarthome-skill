package org.smarthome.skill.jsonbean.rokid.request;

import java.util.List;

public class Endpoint {

	private AdditionalInfo additionalInfo;
	private String endpointId;
	private List<States> states;

	public void setAdditionalInfo(AdditionalInfo additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public AdditionalInfo getAdditionalInfo() {
		return additionalInfo;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
	}

	public String getEndpointId() {
		return endpointId;
	}

	public void setStates(List<States> states) {
		this.states = states;
	}

	public List<States> getStates() {
		return states;
	}

}