package cn.huangdayu.smarthome.skill.jsonbean.aligenie.response;

import java.util.List;
import lombok.Data;

@Data
public class AliGenieResponsePayload {

	private String deviceId;
	private List<AliGenieResponseDevices> devices;
	private String errorCode;
	private String message;
	private List<AliGenieResponseProperties> properties;

}