package org.smarthome.skill.util;

import java.util.ArrayList;
import java.util.List;

public class MobvoiSkillUtil {

	/***
	 * 空调
	 * 
	 * @return
	 */
	public static List<String> getAirList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOnRequest");// 打开
		actionsList.add("TurnOffRequest");// 关闭
		actionsList.add("IncrementTargetTemperatureRequest");// 升高温度
		actionsList.add("DecrementTargetTemperatureRequest");// 降低温度
		actionsList.add("SetTargetTemperatureRequest");// 设置温度
		actionsList.add("IncrementTargetWindSpeedRequest");// 增加风速
		actionsList.add("DecrementTargetWindSpeedRequest");// 减小风速
		actionsList.add("SetTargetModeRequest");// 设置模式
		return actionsList;
	}

	/***
	 * 电视
	 * 
	 * @return
	 */
	public static List<String> getTVList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOnRequest");// 打开
		actionsList.add("TurnOffRequest");// 关闭
		actionsList.add("IncrementTargetVolumeRequest");// 调高音量
		actionsList.add("DecrementTargetVolumeRequest");// 调低音量
		actionsList.add("DecrementTargetChannelRequest");// 上一个频道
		actionsList.add("IncrementTargetChannelRequest");// 下一个频道
		actionsList.add("SetTargetChannelRequest");// 设置频道
		actionsList.add("SetTargetMuteRequest");// 设置设备静音状态
		return actionsList;
	}

	/***
	 * 机顶盒
	 * 
	 * @return
	 */
	public static List<String> getSTBList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOnRequest");// 打开
		actionsList.add("TurnOffRequest");// 关闭
		actionsList.add("IncrementTargetVolumeRequest");// 调高音量
		actionsList.add("DecrementTargetVolumeRequest");// 调低音量
		actionsList.add("DecrementTargetChannelRequest");// 上一个频道
		actionsList.add("IncrementTargetChannelRequest");// 下一个频道
		actionsList.add("SetTargetChannelRequest");// 设置频道
		actionsList.add("SetTargetMuteRequest");// 设置设备静音状态
		return actionsList;
	}

	/***
	 * DVD
	 * 
	 * @return
	 */
	public static List<String> getDVDList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOnRequest");// 打开
		actionsList.add("TurnOffRequest");// 关闭
		actionsList.add("IncrementTargetVolumeRequest");// 调高音量
		actionsList.add("DecrementTargetVolumeRequest");// 调低音量
		actionsList.add("DecrementTargetChannelRequest");// 上一个频道
		actionsList.add("IncrementTargetChannelRequest");// 下一个频道
		actionsList.add("SetTargetChannelRequest");// 设置频道
		actionsList.add("SetTargetMuteRequest");// 设置设备静音状态
		return actionsList;
	}

	/***
	 * 电风扇
	 * 
	 * @return
	 */
	public static List<String> getFanList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOnRequest");// 打开
		actionsList.add("TurnOffRequest");// 关闭
		actionsList.add("IncrementTargetWindSpeedRequest");// 增加风速
		actionsList.add("DecrementTargetWindSpeedRequest");// 减小风速
		actionsList.add("SetTargetModeRequest");// 设置模式
		return actionsList;
	}

	/***
	 * 空气净化器
	 * 
	 * @return
	 */
	public static List<String> getAirCleanerList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOnRequest");// 打开
		actionsList.add("TurnOffRequest");// 关闭
		actionsList.add("IncrementTargetWindSpeedRequest");// 增加风速
		actionsList.add("DecrementTargetWindSpeedRequest");// 减小风速
		actionsList.add("SetTargetModeRequest");// 设置模式
		return actionsList;
	}

	/***
	 * 功放
	 * 
	 * @return
	 */
	public static List<String> getGongFangList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOnRequest");// 打开
		actionsList.add("TurnOffRequest");// 关闭
		actionsList.add("SetTargetMuteRequest");// 设置设备静音状态
		actionsList.add("IncrementTargetVolumeRequest");// 调高音量
		actionsList.add("DecrementTargetVolumeRequest");// 调低音量
		actionsList.add("DecrementTargetChannelRequest");// 上一个频道
		actionsList.add("IncrementTargetChannelRequest");// 下一个频道
		return actionsList;
	}

	/***
	 * 电视盒子
	 * 
	 * @return
	 */
	public static List<String> getTvBoxList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOnRequest");// 打开
		actionsList.add("TurnOffRequest");// 关闭
		actionsList.add("IncrementTargetVolumeRequest");// 调高音量
		actionsList.add("DecrementTargetVolumeRequest");// 调低音量
		actionsList.add("DecrementTargetChannelRequest");// 上一个频道
		actionsList.add("IncrementTargetChannelRequest");// 下一个频道
		actionsList.add("SetTargetMuteRequest");// 设置设备静音状态
		actionsList.add("SetTargetChannelRequest");// 设置频道
		return actionsList;
	}

	/***
	 * 投影仪
	 * 
	 * @return
	 */
	public static List<String> getProjectorList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOnRequest");// 打开
		actionsList.add("TurnOffRequest");// 关闭
		actionsList.add("IncrementTargetVolumeRequest");// 调高音量
		actionsList.add("DecrementTargetVolumeRequest");// 调低音量
		actionsList.add("DecrementTargetChannelRequest");// 上一个频道
		actionsList.add("IncrementTargetChannelRequest");// 下一个频道
		return actionsList;
	}

	/**
	 * 热水器
	 * 
	 * @return
	 */
	public static List<String> getWaterHeaterList() {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOnRequest");// 打开
		actionsList.add("TurnOffRequest");// 关闭
		actionsList.add("IncrementTargetTemperatureRequest");// 升高温度
		actionsList.add("DecrementTargetTemperatureRequest");// 降低温度
		actionsList.add("SetTargetTemperatureRequest");// 设置温度
		actionsList.add("SetTargetModeRequest");// 设置模式
		return actionsList;
	}
}