package cn.huangdayu.smarthome.skill.jsonbean.mobvoi.response;

import lombok.Data;

@Data
public class MobvoiResponseRoot {
	private MobvoiResponseHeader header;

	private MobvoiResponsePayload payload;

}
