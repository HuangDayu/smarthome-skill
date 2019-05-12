package cn.huangdayu.smarthome.skill.jsonbean.aligenie.response;

import java.util.List;

import lombok.Data;

@Data
public class AliGenieResponseRootBean {

	private AliGenieResponseHeader header;
	private AliGenieResponsePayload payload;
	private List<AliGenieResponseProperties> properties;

}