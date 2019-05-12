package cn.huangdayu.smarthome.skill.jsonbean.speech.response;

import java.util.List;

import lombok.Data;

@Data
public class SpeechResponseRootBean {

	private SpeechResponseHeader header;
	private SpeechResponsePayload payload;
	private List<SpeechResponseProperties> properties;

}