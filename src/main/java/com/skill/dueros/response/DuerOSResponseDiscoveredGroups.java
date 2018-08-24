package com.skill.dueros.response;

import java.util.List;

public class DuerOSResponseDiscoveredGroups {
	private String groupName;

	private List<String> applianceIds;

	private String groupNotes;

	private DuerOSResponseAdditionalGroupDetails additionalGroupDetails;

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setApplianceIds(List<String> applianceIds) {
		this.applianceIds = applianceIds;
	}

	public List<String> getApplianceIds() {
		return this.applianceIds;
	}

	public void setGroupNotes(String groupNotes) {
		this.groupNotes = groupNotes;
	}

	public String getGroupNotes() {
		return this.groupNotes;
	}

	public void setAdditionalGroupDetails(DuerOSResponseAdditionalGroupDetails additionalGroupDetails) {
		this.additionalGroupDetails = additionalGroupDetails;
	}

	public DuerOSResponseAdditionalGroupDetails getAdditionalGroupDetails() {
		return this.additionalGroupDetails;
	}
}
