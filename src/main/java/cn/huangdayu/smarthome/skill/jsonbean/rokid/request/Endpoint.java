package cn.huangdayu.smarthome.skill.jsonbean.rokid.request;

import java.util.List;

import lombok.Data;

@Data
public class Endpoint {

	private AdditionalInfo additionalInfo;
	private String endpointId;
	private List<States> states;

}