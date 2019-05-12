package cn.huangdayu.smarthome.skill.jsonbean.rokid.response;

import java.util.List;

import lombok.Data;

@Data
public class RokidResponseEndpoints {

	private RokidResponseAdditionalInfo additionalInfo;
	private List<RokidResponseCapabilities> capabilities;
	private String displayName;
	private String displayType;
	private String endpointId;
	private String modelId;
	private String recommendRoomName;
	private List<RokidResponseStates> states;

}