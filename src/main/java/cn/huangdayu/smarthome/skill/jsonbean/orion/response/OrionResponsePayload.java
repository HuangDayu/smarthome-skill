package cn.huangdayu.smarthome.skill.jsonbean.orion.response;

import java.util.List;

import lombok.Data;

@Data
public class OrionResponsePayload {

	private String deviceId;
	private List<OrionResponseDevices> devices;
	private String errorCode;
	private String message;
	private List<OrionResponseProperties> properties;

}