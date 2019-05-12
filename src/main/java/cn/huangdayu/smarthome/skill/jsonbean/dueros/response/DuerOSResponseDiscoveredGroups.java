package cn.huangdayu.smarthome.skill.jsonbean.dueros.response;

import java.util.List;

import lombok.Data;

@Data
public class DuerOSResponseDiscoveredGroups {
	private String groupName;

	private List<String> applianceIds;

	private String groupNotes;

	private DuerOSResponseAdditionalGroupDetails additionalGroupDetails;

}
