package cn.huangdayu.smarthome.skill.util;

import java.util.ArrayList;
import java.util.List;

import cn.huangdayu.smarthome.skill.enums.DeviceTypeEnum;

public class DuerOSSkillUtil {
	
	public static List<String> getBaiduCmdList(String type){
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("getTurnOnState");//查询设备打开状态
		switch (type) {
		case "AIR_CONDITION"://空调
			actionsList.add("incrementTemperature");// 升高温度
			actionsList.add("decrementTemperature");// 降低温度
			actionsList.add("setTemperature");// 设置温度
			actionsList.add("incrementFanSpeed");// 增加风速
			actionsList.add("decrementFanSpeed");// 减小风速
			actionsList.add("setFanSpeed");// 设置风速
			actionsList.add("setMode");// 设置模式
			actionsList.add("setSwing");// 设置摇摆功能
			actionsList.add("getTemperatureReading");//读取温度 
			actionsList.add("getTargetTemperature");//查询温度 
			break;
		case "TV_SET"://电视机,DVD,电视盒子,投影仪,音响
			actionsList.add("incrementVolume");//调高音量
			actionsList.add("decrementVolume");//调低音量
			actionsList.add("decrementTVChannel");//上一个频道
			actionsList.add("incrementTVChannel");//下一个频道
			actionsList.add("setVolume");//设置音量
			actionsList.add("setTVChannel");//设置频道
			actionsList.add("setVolumeMute");//设置设备静音状态
			actionsList.add("getTurnOnState");//查询设备打开状态
			actionsList.add("pause");// 暂停
			actionsList.add("continue");// 继续
			actionsList.add("returnTVChannel");//返回上一个频道
			break;
		case "SET_TOP_BOX":// 机顶盒
			actionsList.add("incrementVolume");//调高音量
			actionsList.add("decrementVolume");//调低音量
			actionsList.add("decrementTVChannel");//上一个频道
			actionsList.add("incrementTVChannel");//下一个频道
			actionsList.add("setVolume");//设置音量
			actionsList.add("setTVChannel");//设置频道
			actionsList.add("setVolumeMute");//设置设备静音状态
			actionsList.add("getTurnOnState");//查询设备打开状态
			actionsList.add("pause");// 暂停
			actionsList.add("continue");// 继续
			actionsList.add("returnTVChannel");//返回上一个频道
			break;
		case "FAN"://风扇
			actionsList.add("incrementFanSpeed");// 增加风速
			actionsList.add("decrementFanSpeed");// 减小风速
			actionsList.add("setFanSpeed");// 设置风速
			actionsList.add("setMode");// 设置模式
			actionsList.add("setSwing");// 设置摇摆功能
			break;
		case "AIR_PURIFIER"://空气进化器
			actionsList.add("incrementFanSpeed");// 增加风速
			actionsList.add("decrementFanSpeed");// 减小风速
			actionsList.add("setFanSpeed");// 设置风速
			actionsList.add("setNegativeIon");// 设置负离子
			actionsList.add("setMode");// 设置模式
			break;
		case "WATER_HEATER":
			actionsList.add("incrementTemperature");// 升高温度
			actionsList.add("decrementTemperature");// 降低温度
			actionsList.add("setTemperature");// 设置温度
			actionsList.add("setMode");// 设置模式
			actionsList.add("getTemperatureReading");//查询温度 
			break;
		default:
			break;
		}
		return actionsList;
	}
	
	
	
	/***
	 * 场景
	 * @return
	 */
	public static List<String> getSceneList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("timingTurnOn");// 定时打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("timingTurnOff");// 定时关闭
		return actionsList;
	}
	
	/***
	 * G1子设备和WiFi插座
	 * @return
	 */
	public static List<String> getSubEquipmentList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("pause");// 暂停
		actionsList.add("continue");// 暂停
		actionsList.add("getTurnOnState");//查询设备打开状态
		return actionsList;
	}
	
	/***
	 * 空调
	 * @return
	 */
	public static List<String> getAirList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("timingTurnOn");// 定时打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("timingTurnOff");// 定时关闭
		actionsList.add("incrementTemperature");// 升高温度
		actionsList.add("decrementTemperature");// 降低温度
		actionsList.add("setTemperature");// 设置温度
		actionsList.add("incrementFanSpeed");// 增加风速
		actionsList.add("decrementFanSpeed");// 减小风速
		actionsList.add("setFanSpeed");// 设置风速
		actionsList.add("setMode");// 设置模式
		actionsList.add("setSwing");// 设置摇摆功能
		actionsList.add("getTemperatureReading");//读取温度 
		actionsList.add("getTargetTemperature");//查询温度 
		actionsList.add("getTurnOnState");//查询设备打开状态
		return actionsList;
	}
	/***
	 * 电视
	 * @return
	 */
	public static List<String> getTVList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("timingTurnOn");// 定时打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("timingTurnOff");// 定时关闭
		actionsList.add("pause");// 暂停
		actionsList.add("continue");// 继续
		actionsList.add("incrementVolume");//调高音量
		actionsList.add("decrementVolume");//调低音量
		actionsList.add("setVolume");//设置音量
		actionsList.add("decrementTVChannel");//上一个频道
		actionsList.add("incrementTVChannel");//下一个频道
		actionsList.add("setTVChannel");//设置频道
		actionsList.add("setVolumeMute");//设置设备静音状态
		actionsList.add("getTurnOnState");//查询设备打开状态
		return actionsList;
	}
	/***
	 * 机顶盒
	 * @return
	 */
	public static List<String> getSTBList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("timingTurnOn");// 定时打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("timingTurnOff");// 定时关闭
		actionsList.add("incrementVolume");//调高音量
		actionsList.add("decrementVolume");//调低音量
		actionsList.add("setVolume");//设置音量
		actionsList.add("decrementTVChannel");//上一个频道
		actionsList.add("incrementTVChannel");//下一个频道
		actionsList.add("setTVChannel");//设置频道
		actionsList.add("setVolumeMute");//设置设备静音状态
		actionsList.add("getTurnOnState");//查询设备打开状态
		actionsList.add("pause");// 暂停
		actionsList.add("continue");// 继续
		return actionsList;
	}
	/***
	 * DVD
	 * @return
	 */
	public static List<String> getDVDList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("timingTurnOn");// 定时打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("timingTurnOff");// 定时关闭
		actionsList.add("pause");// 暂停
		actionsList.add("continue");// 继续
		actionsList.add("incrementVolume");//调高音量
		actionsList.add("decrementVolume");//调低音量
		actionsList.add("setVolume");//设置音量
		actionsList.add("decrementTVChannel");//上一个频道
		actionsList.add("incrementTVChannel");//下一个频道
		actionsList.add("setTVChannel");//设置频道
		actionsList.add("setVolumeMute");//设置设备静音状态
		actionsList.add("getTurnOnState");//查询设备打开状态
		return actionsList;
	}
	/***
	 * 电风扇
	 * @return
	 */
	public static List<String> getFanList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("timingTurnOn");// 定时打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("timingTurnOff");// 定时关闭
		actionsList.add("incrementFanSpeed");// 增加风速
		actionsList.add("decrementFanSpeed");// 减小风速
		actionsList.add("setFanSpeed");// 设置风速
		actionsList.add("setMode");// 设置模式
		actionsList.add("setSwing");// 设置摇摆功能
		actionsList.add("getTurnOnState");//查询设备打开状态
		return actionsList;
	}
	
	/***
	 * 空气净化器
	 * @return
	 */
	public static List<String> getAirCleanerList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("timingTurnOn");// 定时打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("timingTurnOff");// 定时关闭
		actionsList.add("incrementFanSpeed");// 增加风速
		actionsList.add("decrementFanSpeed");// 减小风速
		actionsList.add("setFanSpeed");// 设置风速
		actionsList.add("setNegativeIon");// 设置负离子
		actionsList.add("setMode");// 设置模式
		actionsList.add("getTurnOnState");//查询设备打开状态
		return actionsList;
	}
	/***
	 * 音箱（功放）
	 * @return
	 */
	public static List<String> getGongFangList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("timingTurnOn");// 定时打开
		actionsList.add("turnOff");//关闭
		actionsList.add("timingTurnOff");//定时关闭
		actionsList.add("setVolumeMute");//设置设备静音状态
		actionsList.add("decrementTVChannel");//上一个频道
		actionsList.add("incrementTVChannel");//下一个频道
		actionsList.add("incrementVolume");//调高音量
		actionsList.add("decrementVolume");//调低音量
		actionsList.add("getTurnOnState");//查询设备打开状态
		return actionsList;
	}
	/***
	 * 电视盒子
	 * @return
	 */
	public static List<String> getTvBoxList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("timingTurnOn");// 定时打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("timingTurnOff");// 定时关闭
		actionsList.add("pause");// 暂停
		actionsList.add("continue");// 继续
		actionsList.add("incrementVolume");//调高音量
		actionsList.add("decrementVolume");//调低音量
		actionsList.add("setVolume");//设置音量
		actionsList.add("decrementTVChannel");//上一个频道
		actionsList.add("incrementTVChannel");//下一个频道
		actionsList.add("setTVChannel");//设置频道
		actionsList.add("setVolumeMute");//设置设备静音状态
		actionsList.add("returnTVChannel");//返回上一个频道
		actionsList.add("getTurnOnState");//查询设备打开状态
		return actionsList;
	}
	/***
	 * 投影仪
	 * @return
	 */
	public static List<String> getProjectorList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("timingTurnOn");// 定时打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("timingTurnOff");// 定时关闭
		actionsList.add("incrementVolume");//调高音量
		actionsList.add("decrementVolume");//调低音量
		actionsList.add("decrementTVChannel");//上一个
		actionsList.add("incrementTVChannel");//下一个
		actionsList.add("returnTVChannel");//返回
		actionsList.add("getTurnOnState");//查询设备打开状态
		return actionsList;
	}
	
	/**
	 * 热水器
	 * @return
	 */
	public static List<String> getWaterHeaterList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("turnOn");// 打开
		actionsList.add("timingTurnOn");// 定时打开
		actionsList.add("turnOff");// 关闭
		actionsList.add("timingTurnOff");// 定时关闭
		actionsList.add("incrementTemperature");// 升高温度
		actionsList.add("decrementTemperature");// 降低温度
		actionsList.add("setTemperature");// 设置温度
		actionsList.add("setMode");// 设置模式
		actionsList.add("getTemperatureReading");//查询温度 
		actionsList.add("getTurnOnState");//查询设备打开状态
		return actionsList;
	}
}
