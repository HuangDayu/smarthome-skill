package cn.huangdayu.smarthome.skill.jsonbean.mobvoi.response;

import lombok.Data;

@Data
public class MobvoiResponseErrorRoot {
	private MobvoiResponseHeader header;

	private MobvoiResponseErrorPayload payload;

}
