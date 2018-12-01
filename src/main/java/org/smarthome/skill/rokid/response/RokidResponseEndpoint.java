package org.smarthome.skill.rokid.response;

import java.util.List;

public class RokidResponseEndpoint {

	private String endpointId;
	private List<RokidResponseStates> states;

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
	}

	public String getEndpointId() {
		return endpointId;
	}

	public void setStates(List<RokidResponseStates> states) {
		this.states = states;
	}

	public List<RokidResponseStates> getStates() {
		return states;
	}

}