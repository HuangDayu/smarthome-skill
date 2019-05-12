package cn.huangdayu.smarthome.skill.jsonbean.jdalpha.response;

import java.util.List;

import lombok.Data;

@Data
public class JDAlphaResponsePayload {

	private List<JDAlphaResponseDeviceInfo> DeviceInfo;
	private String deviceId;
	private String errorCode;
	private String message;
	private JDAlphaResponseProperties properties;
	private String result;

}