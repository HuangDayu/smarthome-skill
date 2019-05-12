package cn.huangdayu.smarthome.skill.jsonbean.mobvoi.response;

import java.util.List;

import lombok.Data;

@Data
public class MobvoiResponseDiscoveredAppliances {
	private List<String> actions;

	private MobvoiResponseAdditionalApplianceDetails additionalApplianceDetails;

	private String applianceId;

	private List<String> applianceTypes;

	private String friendlyDescription;

	private String friendlyName;

	private String manufacturerName;

	private String modelName;

	private String tag;

	private String version;

}
