
package cn.huangdayu.smarthome.skill.jsonbean.orion.request;

import lombok.Data;

@Data
public class Header {

	private String messageId;
	private String name;
	private String namespace;
	private int payLoadVersion;

}