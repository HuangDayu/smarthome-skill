package cn.huangdayu.smarthome.skill.jsonbean.dueros.response;

import java.util.List;

import lombok.Data;

@Data
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

}
