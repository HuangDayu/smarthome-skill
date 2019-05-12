package cn.huangdayu.smarthome.skill.jsonbean.orion.response;

import java.util.List;

import lombok.Data;

@Data
public class OrionResponseRootBean {

	private OrionResponseHeader header;
	private OrionResponsePayload payload;
	private List<OrionResponseProperties> properties;

}