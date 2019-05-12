package cn.huangdayu.smarthome.skill.jsonbean.rokid.response;

import java.util.List;

import lombok.Data;

@Data
public class RokidResponseEndpoint {

	private String endpointId;
	private List<RokidResponseStates> states;

}