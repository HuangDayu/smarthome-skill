package org.smarthome.skill.jsonbean.dueros.request;

public class Appliance {
	private AdditionalApplianceDetails additionalApplianceDetails;

	private String applianceId;

	public void setAdditionalApplianceDetails(AdditionalApplianceDetails additionalApplianceDetails) {
		this.additionalApplianceDetails = additionalApplianceDetails;
	}

	public AdditionalApplianceDetails getAdditionalApplianceDetails() {
		return this.additionalApplianceDetails;
	}

	public void setApplianceId(String applianceId) {
		this.applianceId = applianceId;
	}

	public String getApplianceId() {
		return this.applianceId;
	}
}
