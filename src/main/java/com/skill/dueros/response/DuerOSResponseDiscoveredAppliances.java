package com.skill.dueros.response;

import java.util.List;

public class DuerOSResponseDiscoveredAppliances {
	private List<String> actions;

	private List<String> applianceTypes;

	private DuerOSResponseAdditionalApplianceDetails additionalApplianceDetails;

	private String applianceId;

	private String friendlyDescription;

	private String friendlyName;

	private boolean isReachable;

	private String manufacturerName;

	private String modelName;

	private String version;

	public void setActions(List<String> actions) {
		this.actions = actions;
	}

	public List<String> getActions() {
		return this.actions;
	}

	public void setApplianceTypes(List<String> applianceTypes) {
		this.applianceTypes = applianceTypes;
	}

	public List<String> getApplianceTypes() {
		return this.applianceTypes;
	}

	public void setAdditionalApplianceDetails(DuerOSResponseAdditionalApplianceDetails additionalApplianceDetails) {
		this.additionalApplianceDetails = additionalApplianceDetails;
	}

	public DuerOSResponseAdditionalApplianceDetails getAdditionalApplianceDetails() {
		return this.additionalApplianceDetails;
	}

	public void setApplianceId(String applianceId) {
		this.applianceId = applianceId;
	}

	public String getApplianceId() {
		return this.applianceId;
	}

	public void setFriendlyDescription(String friendlyDescription) {
		this.friendlyDescription = friendlyDescription;
	}

	public String getFriendlyDescription() {
		return this.friendlyDescription;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public String getFriendlyName() {
		return this.friendlyName;
	}

	public void setIsReachable(boolean isReachable) {
		this.isReachable = isReachable;
	}

	public boolean getIsReachable() {
		return this.isReachable;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getManufacturerName() {
		return this.manufacturerName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return this.version;
	}
}
