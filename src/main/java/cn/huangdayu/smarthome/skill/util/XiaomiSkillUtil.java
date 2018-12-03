package cn.huangdayu.smarthome.skill.util;

import java.util.HashMap;
import java.util.Map;

public class XiaomiSkillUtil {

	class Type {
		/** 电视 */
		public static final String XIAOMI_TYPE_IR_TV = "urn:miot-spec-v2:device:television:0000A010:ayzn-irtv:1";
		/** 风扇 */
		public static final String XIAOMI_TYPE_IR_FAN = "urn:miot-spec-v2:device:fan:0000A005:ayzn-irfan:1";
		/** 红外空调 */
		public static final String XIAOMI_TYPE_IR_AIRCONDITION = "urn:miot-spec-v2:device:air-conditioner:0000A004:ayzn-i1:1";
		/** 机顶盒 */
		public static final String XIAOMI_TYPE_IR_STB = "urn:miot-spec-v2:device:stb:0000A011:ayzn-irstb:1";
		/** 窗帘开关 */
		public static final String XIAOMI_CURTAIN = "urn:miot-spec-v2:device:curtain:0000A00C:ayzn-aycurtain:1";
		/** 开关面板 */
		public static final String XIAOMI_SWITCH = "urn:miot-spec-v2:device:switch:0000A003:ayzn-ayswitch:1";
		/** WIFI插座 */
		public static final String XIAOMI_WIFI_PB = "urn:miot-spec-v2:device:outlet:0000A002:ayzn-wifipb:1";
	}

	/***
	 * 根据小米的请求，拿到对应的艾韵智能的指令
	 * 
	 * @param type
	 * @param siid
	 * @param piid
	 * @return
	 */
	public static Map<String, Object> getCmd(int type, int siid, int piid, int aiid, Object value,
			Map<String, Object> eachoMap) {
		switch (type) {
		case 1:// 空调
			return irAirconditionCmd(siid, piid, aiid, value);
		case 2:// 电视
			return irTelevisionCmd(piid, aiid, value, eachoMap);
		case 3:// 机顶盒
			return irStbCmd(piid, aiid, value, eachoMap);
		case 4:// DVD
			return irStbCmd(piid, aiid, value, eachoMap);
		case 5:// 电风扇
			return irFanCmd(piid, aiid, value);
		case 6:// 空气净化器
			break;
		case 7:// 电视盒子
			return irStbCmd(piid, aiid, value, eachoMap);
		case 8:// 投影仪
			break;
		case 9:// 功放(音箱)
			break;
		case 10:// 热水器
			break;
		case 1000:// G1子设备，WiFi插座
			return getAYG1SCmd(siid, piid, value);
		default:
			break;
		}
		return null;
	}

	private static Map<String, Object> getAYG1SCmd(int siid, int piid, Object value) {
		Map<String, Object> aYG1SMap = new HashMap<String, Object>();
		if (903 == siid) {// 窗帘开关
			if (161 == piid) {
				int control = objectToInt(value);
				if (0 == control) {
					aYG1SMap.put("cmd", "Pause");// 暂停
				} else if (1 == control) {
					aYG1SMap.put("cmd", "TurnOn");// 打开
				} else if (2 == control) {
					aYG1SMap.put("cmd", "TurnOff");// 关闭
				}
			}
		} else if (764 == siid) {// 开关
			if (297 == piid) {
				boolean on = (Boolean) value;
				if (on) {
					aYG1SMap.put("cmd", "TurnOn");// 打开
				} else {
					aYG1SMap.put("cmd", "TurnOff");// 关闭
				}
			}
		} else if (394 == siid) {// WiFi插座
			if (763 == piid) {
				boolean on = (Boolean) value;
				if (on) {
					aYG1SMap.put("cmd", "TurnOn");// 打开
				} else {
					aYG1SMap.put("cmd", "TurnOff");// 关闭
				}
			}
		}
		return aYG1SMap;
	}

	/***
	 * 从缓存中拿到值
	 * 
	 * @param type
	 * @param siid
	 * @param piid
	 * @param eachoMap
	 * @return
	 */
	public static Object getValue(int type, int siid, int piid, int aiid, Map eachoMap) {
		Object value = null;
		switch (siid) {
		case 1:// 空调
			if (1 == piid) {
				value = "艾韵智能";// manufacturer 制造商
			} else if (2 == piid) {
				value = eachoMap.get("deviceType");// model 模型，型号
			} else if (3 == piid) {
				value = eachoMap.get("hardwareID");// serial number 序列号
			} else if (4 == piid) {
				value = eachoMap.get("firmwareVersion");// firmware revision 固件版本
			} else {
				value = "ayzn";
			}
			return String.valueOf(value);
		case 151:// 风扇
			if (402 == piid) {
				value = "艾韵智能";// manufacturer 制造商
			} else if (152 == piid) {
				value = eachoMap.get("deviceType");// model 模型，型号
			} else if (111 == piid) {
				value = eachoMap.get("hardwareID");// serial number 序列号
			} else if (161 == piid) {
				value = eachoMap.get("firmwareVersion");// firmware revision 固件版本
			} else {
				value = "ayzn";
			}
			return String.valueOf(value);
		case 183:// 机顶盒
			if (335 == piid) {
				value = "艾韵智能";// manufacturer 制造商
			} else if (182 == piid) {
				value = eachoMap.get("deviceType");// model 模型，型号
			} else if (197 == piid) {
				value = eachoMap.get("hardwareID");// serial number 序列号
			} else if (147 == piid) {
				value = eachoMap.get("firmwareVersion");// firmware revision 固件版本
			} else {
				value = "ayzn";
			}
			return String.valueOf(value);
		case 372:// 电视
			if (361 == piid) {
				value = "艾韵智能";// manufacturer 制造商
			} else if (255 == piid) {
				value = eachoMap.get("deviceType");// model 模型，型号
			} else if (574 == piid) {
				value = eachoMap.get("hardwareID");// serial number 序列号
			} else if (319 == piid) {
				value = eachoMap.get("firmwareVersion");// firmware revision 固件版本
			} else {
				value = "ayzn";
			}
			return String.valueOf(value);
		case 395:// 开关
			if (351 == piid) {
				value = "艾韵智能";// manufacturer 制造商
			} else if (312 == piid) {
				value = eachoMap.get("deviceType");// model 模型，型号
			} else if (216 == piid) {
				value = eachoMap.get("hardwareID");// serial number 序列号
			} else if (207 == piid) {
				value = eachoMap.get("firmwareVersion");// firmware revision 固件版本
			} else {
				value = "ayzn";
			}
			return String.valueOf(value);
		case 908:// 窗帘
			if (145 == piid) {
				value = "艾韵智能";// manufacturer 制造商
			} else if (102 == piid) {
				value = eachoMap.get("deviceType");// model 模型，型号
			} else if (109 == piid) {
				value = eachoMap.get("hardwareID");// serial number 序列号
			} else if (313 == piid) {
				value = eachoMap.get("firmwareVersion");// firmware revision 固件版本
			} else {
				value = "ayzn";
			}
			return String.valueOf(value);
		case 132:// WiFi 插座
			if (265 == piid) {
				value = "艾韵智能";// manufacturer 制造商
			} else if (207 == piid) {
				value = eachoMap.get("deviceType");// model 模型，型号
			} else if (263 == piid) {
				value = eachoMap.get("hardwareID");// serial number 序列号
			} else if (155 == piid) {
				value = eachoMap.get("firmwareVersion");// firmware revision 固件版本
			} else {
				value = "ayzn";
			}
			return String.valueOf(value);
		case 394:// WiFi插座 电源状态
			if (763 == piid) {
				value = eachoMap.get("deviceStatus");// 0关1开
				if (String.valueOf(value).equals("1")) {
					return true;
				} else {
					return false;
				}
			} else {
				value = eachoMap.get("hardwareStatus");// 0是离线 1是在线
				if (String.valueOf(value).equals("1")) {
					return true;
				} else {
					return false;
				}
			}
		case 764:// 开关电源状态
			if (297 == piid) {
				value = eachoMap.get("deviceStatus");// 0关1开
				if (String.valueOf(value).equals("1")) {
					return true;
				} else {
					return false;
				}
			} else {
				value = eachoMap.get("hardwareStatus");// 0是离线 1是在线
				if (String.valueOf(value).equals("1")) {
					return true;
				} else {
					return false;
				}
			}
		case 903:// 窗帘电源状态
			if (129 == piid) {
				value = eachoMap.get("hardwareStatus");// 0是离线 1是在线
				if (String.valueOf(value).equals("1")) {
					return 0;// 在线即无故障
				} else {
					return 1;// 离线即故障
				}
			}
			break;
		default:
			break;
		}
		return String.valueOf(value);
	}

	static String[][] modes = { { "0", "auto" }, { "1", "airsupply" }, { "2", "dehumidification" }, { "3", "cold" },
			{ "4", "heat" } };
	static String[] devicesStrs = { "自定义", "空调", "电视", "机顶盒", "DVD", "电风扇", "空气净化器", "电视盒子", "投影仪", "音箱", "热水器" };

	/***
	 * 获取机顶盒命令
	 * 
	 * @param piid
	 * @param aiid
	 * @param value
	 * @return
	 */
	private static Map<String, Object> irStbCmd(int piid, int aiid, Object value, Map<String, Object> eachoMap) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (156 == aiid) {// channel-down 频道-
			map.put("cmd", "AdjustDownChannel");// 上一首或上一台
		} else if (943 == aiid) {// channel-up 频道+
			map.put("cmd", "AdjustUpChannel");// 上一首或上一台
		} else if (220 == aiid || 937 == aiid) {// mute 静音
			map.put("cmd", "SetMute");
		} else if (117 == aiid) {// toggle 开机或者关机
			map.put("cmd", "TurnOff");
		} else if (166 == aiid) {
			map.put("cmd", "TurnOn");
		} else if (201 == aiid) {// volume-down 音量-
			map.put("cmd", "AdjustDownVolume");
		} else if (165 == aiid) {// volume-up 音量+
			map.put("cmd", "AdjustUpVolume");
		}
		return map;
	}

	/***
	 * 拿到电视操作指令
	 * 
	 * @param piid
	 * @param aiid
	 * @param value
	 * @return
	 */
	private static Map<String, Object> irTelevisionCmd(int piid, int aiid, Object value, Map<String, Object> eachoMap) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (189 == aiid) {// channel-down 频道-
			map.put("cmd", "AdjustDownChannel");// 上一首或上一台
		} else if (407 == aiid) {// channel-up 频道+
			map.put("cmd", "AdjustUpChannel");// 上一首或上一台
		} else if (765 == aiid || 373 == aiid) {// mute-off 关闭静音 mute-on 打开静音 mute 静音
			map.put("cmd", "SetMute");
		} else if (203 == aiid) {// 关机
			map.put("cmd", "TurnOff");
		} else if (231 == aiid) {// 开机
			map.put("cmd", "TurnOn");
		} else if (619 == aiid) {// volume-down 音量-
			map.put("cmd", "AdjustDownVolume");
		} else if (401 == aiid) {// volume-up 音量+
			map.put("cmd", "AdjustUpVolume");
		}
		return map;
	}

	/***
	 * 拿到风扇操作的指令
	 * 
	 * @param piid
	 * @param value
	 * @return
	 */
	private static Map<String, Object> irFanCmd(int piid, int aiid, Object value) {
		Map<String, Object> fanMap = new HashMap<String, Object>();
		if (1 == piid) {
			boolean on = (Boolean) value;
			if (on) {
				fanMap.put("cmd", "TurnOn");
			} else {
				fanMap.put("cmd", "TurnOff");
			}
		} else if (2 == piid) {
			int level = (int) value;
			if (0 == level) {
				fanMap.put("cmd", "SetWindSpeed");
				fanMap.put("value", "2");
			} else {
				fanMap.put("cmd", "SetWindSpeed");
				fanMap.put("value", String.valueOf(level));
			}
		} else if (3 == piid) {
			boolean swing = (Boolean) value;
			if (swing) {
				fanMap.put("cmd", "OpenSwing");
			} else {
				fanMap.put("cmd", "CloseSwing");
			}
		} else if (662 == aiid) {// 风速-
			fanMap.put("cmd", "AdjustDownWindSpeed");
		} else if (103 == aiid) {// 风速+
			fanMap.put("cmd", "AdjustUpWindSpeed");
		} else if (191 == aiid) {// 关机
			fanMap.put("cmd", "TurnOff");
		} else if (141 == aiid) {// 开机
			fanMap.put("cmd", "TurnOn");
		}
		return fanMap;
	}

	/***
	 * 拿到空调操作的指令
	 * 
	 * @param piid
	 * @param value
	 * @return
	 */
	private static Map<String, Object> irAirconditionCmd(int siid, int piid, int aiid, Object value) {
		Map<String, Object> airconditionMap = new HashMap<String, Object>();
		if (2 == siid) {
			if (1 == piid) {
				airconditionMap.put("cmd", "SetMode");
				int mode = (int) value;
				if (1 == mode) {
					airconditionMap.put("value", "auto");
				} else if (2 == mode) {
					airconditionMap.put("value", "heat");
				} else if (3 == mode) {
					airconditionMap.put("value", "cold");
				} else if (4 == mode) {
					airconditionMap.put("value", "dehumidification");
				} else if (5 == mode) {
					airconditionMap.put("value", "airsupply");
				} else {
					airconditionMap.put("value", "auto");
				}
			} else if (2 == piid) {// 设置温度
				airconditionMap.put("cmd", "SetTemperature");
				int temperature = objectToInt(value);
				airconditionMap.put("value", temperature);
			} else if (1 == aiid) {// 风速减
				airconditionMap.put("cmd", "AdjustDownWindSpeed");
				airconditionMap.put("value", "low");
			} else if (2 == aiid) {// 风速加
				airconditionMap.put("cmd", "AdjustUpWindSpeed");
				airconditionMap.put("value", "high");
			} else if (3 == aiid) {// 温度-
				airconditionMap.put("cmd", "AdjustDownTemperature");
				airconditionMap.put("value", 1);// 默认加减1
			} else if (4 == aiid) {// 温度+
				airconditionMap.put("cmd", "AdjustUpTemperature");
				airconditionMap.put("value", 1);// 默认加减1
			} else if (5 == aiid) {// 关机
				airconditionMap.put("cmd", "TurnOff");
			} else if (6 == aiid) {// 开机
				airconditionMap.put("cmd", "TurnOn");
			}
		}
		return airconditionMap;
	}

	/**
	 * Object 转 Int
	 * 
	 * @param value
	 * @return
	 */
	private static int objectToInt(Object value) {
		return new Double(String.valueOf(value)).intValue();
	}

}
