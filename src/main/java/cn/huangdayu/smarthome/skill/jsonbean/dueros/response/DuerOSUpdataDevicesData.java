package cn.huangdayu.smarthome.skill.jsonbean.dueros.response;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class DuerOSUpdataDevicesData {
	private List<String> failed;

	private List<String> succeed;

}
