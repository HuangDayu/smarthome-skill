package cn.huangdayu.smarthome.skill.jsonbean.open.response;

import java.util.List;

import lombok.Data;

@Data
public class OpenResponsePayload {

	private String deviceId;
	private List<OpenResponseDevices> devices;
	private String errorCode;
	private String errorExplain;
	private String errorMessage;
	private Object value;

}