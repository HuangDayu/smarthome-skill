package com.skill.rokid.response;

import java.util.List;

public class RokidResponseEndpoints {

	private RokidResponseAdditionalInfo additionalInfo;
	private List<RokidResponseCapabilities> capabilities;
	private String displayName;
	private String displayType;
	private String endpointId;
	private String modelId;
	private String recommendRoomName;
	private List<RokidResponseStates> states;

	public void setAdditionalInfo(RokidResponseAdditionalInfo additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public RokidResponseAdditionalInfo getAdditionalInfo() {
		return additionalInfo;
	}

	public void setCapabilities(List<RokidResponseCapabilities> capabilities) {
		this.capabilities = capabilities;
	}

	public List<RokidResponseCapabilities> getCapabilities() {
		return capabilities;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
	}

	public String getEndpointId() {
		return endpointId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getModelId() {
		return modelId;
	}

	public void setRecommendRoomName(String recommendRoomName) {
		this.recommendRoomName = recommendRoomName;
	}

	public String getRecommendRoomName() {
		return recommendRoomName;
	}

	public void setStates(List<RokidResponseStates> states) {
		this.states = states;
	}

	public List<RokidResponseStates> getStates() {
		return states;
	}

}