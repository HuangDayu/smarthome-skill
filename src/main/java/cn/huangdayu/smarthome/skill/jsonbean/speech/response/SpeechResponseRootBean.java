package cn.huangdayu.smarthome.skill.jsonbean.speech.response;

import java.util.List;

public class SpeechResponseRootBean {

	private SpeechResponseHeader header;
	private SpeechResponsePayload payload;
	private List<SpeechResponseProperties> properties;

	public void setHeader(SpeechResponseHeader header) {
		this.header = header;
	}

	public SpeechResponseHeader getHeader() {
		return header;
	}

	public void setPayload(SpeechResponsePayload payload) {
		this.payload = payload;
	}

	public SpeechResponsePayload getPayload() {
		return payload;
	}

	public List<SpeechResponseProperties> getProperties() {
		return properties;
	}

	public void setProperties(List<SpeechResponseProperties> properties) {
		this.properties = properties;
	}

}