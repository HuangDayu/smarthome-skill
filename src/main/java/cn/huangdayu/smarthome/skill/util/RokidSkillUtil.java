package cn.huangdayu.smarthome.skill.util;

import java.util.ArrayList;
import java.util.List;

import cn.huangdayu.smarthome.skill.jsonbean.rokid.response.RokidResponseCapabilities;

public class RokidSkillUtil {

	public static RokidResponseCapabilities getOperationsList(String operations) {
		RokidResponseCapabilities capabilities = new RokidResponseCapabilities();
		capabilities.setInterface_(operations);
		capabilities.setProactivelyReported(true);
		capabilities.setRetrievable(true);
		capabilities.setVersion("v1");
		switch (operations) {
		case "SwingMode": {// 转向状态
			capabilities.setSupportedOperations(getSwingModeList());
			break;
		}
		case "Temperature": {// 温度状态
			capabilities.setSupportedOperations(getTemperatureList());
			break;
		}
		case "FanSpeed": {// 风速状态
			capabilities.setSupportedOperations(getFanSpeedList());
			break;
		}
		case "Mode": {// 模式状态
			capabilities.setSupportedOperations(getModeList());
			break;
		}
		case "Volume": {// 音量状态
			capabilities.setSupportedOperations(getVolumeList());
			break;
		}
		case "Media.TVChannel": {// 频道状态
			capabilities.setSupportedOperations(getMediaTVChannelList());
			break;
		}
		case "Media.Music": {// 音乐控制
			capabilities.setSupportedOperations(getMediaMusiclList());
			break;
		}
		case "PlaybackControl": {// 媒体播放状态
			capabilities.setSupportedOperations(getPlaybackControlList());
			break;
		}
		case "MotionSwitch": {// 行为状态
			capabilities.setSupportedOperations(getMotionSwitchList());
			break;
		}
		case "Switch": {// 开关状态
			capabilities.setSupportedOperations(getSwitchList());
			break;
		}
		default: {
			capabilities.setSupportedOperations(getRokidCmdList());
		}
		}
		return capabilities;
	}

	private static List<String> getModeList() {
		List<String> operationsList = new ArrayList<String>();
		operationsList.add("Set");// 设置为指定值
		operationsList.add("Auto");// 自动模式
		operationsList.add("Cool");// 制冷模式
		operationsList.add("Heat");// 制热模式
		operationsList.add("Dry");// 除湿模式
		operationsList.add("Fan");// 送风模式
		return operationsList;
	}

	private static List<String> getSwingModeList() {
		List<String> operationsList = new ArrayList<String>();
		operationsList.add("On");// 开
		operationsList.add("Off");// 关
		operationsList.add("Auto");// 自动模式
		operationsList.add("Horizon");// 左右摆风
		operationsList.add("HorizonOff");// 关闭左右摆风
		operationsList.add("Vertical");// 上下摆风
		operationsList.add("VerticalOff");// 关闭上下摆风
		return operationsList;
	}

	private static List<String> getTemperatureList() {
		List<String> operationsList = new ArrayList<String>();
		operationsList.add("Set");// 设置为指定值
		operationsList.add("Adjust");// 通过相对值调整
		operationsList.add("SetMax");// 相对值调到最大
		operationsList.add("SetMin");// 相对值调到最小
		return operationsList;
	}

	private static List<String> getFanSpeedList() {
		List<String> operationsList = new ArrayList<String>();
		operationsList.add("Set");// 设置为指定值
		operationsList.add("Adjust");// 通过相对值调整
		operationsList.add("SetMax");// 相对值调到最大
		operationsList.add("SetMin");// 相对值调到最小
		return operationsList;
	}

	private static List<String> getVolumeList() {
		List<String> operationsList = new ArrayList<String>();
		operationsList.add("Set");// 设置为指定值
		operationsList.add("Adjust");// 通过相对值调整
		operationsList.add("SetMax");// 相对值调到最大
		operationsList.add("SetMin");// 相对值调到最小
		return operationsList;
	}

	private static List<String> getMediaTVChannelList() {
		List<String> operationsList = new ArrayList<String>();
		operationsList.add("Set");// 设置为指定值
		operationsList.add("Next");// 下一个频道
		operationsList.add("Previous");// 上一个频道
		return operationsList;
	}

	private static List<String> getMediaMusiclList() {
		List<String> operationsList = new ArrayList<String>();
		operationsList.add("Set");// 设置为指定值
		operationsList.add("Next");// 下一个频道
		operationsList.add("Previous");// 上一个频道
		operationsList.add("Stop");// 停止

		return operationsList;
	}

	private static List<String> getPlaybackControlList() {
		List<String> operationsList = new ArrayList<String>();
		operationsList.add("Play");// 播放
		operationsList.add("Pause");// 暂停
		return operationsList;
	}

	private static List<String> getMotionSwitchList() {
		List<String> operationsList = new ArrayList<String>();
		operationsList.add("On");// 开
		operationsList.add("Off");// 关
		return operationsList;
	}

	private static List<String> getSwitchList() {
		List<String> operationsList = new ArrayList<String>();
		operationsList.add("On");// 开
		operationsList.add("Off");// 关
		return operationsList;
	}

	private static List<String> getRokidCmdList() {
		List<String> operationsList = new ArrayList<String>();
		operationsList.add("On");// 开
		operationsList.add("Off");// 关
		operationsList.add("Set");// 设置为指定值
		operationsList.add("Adjust");// 通过相对值调整
		operationsList.add("SetMax");// 相对值调到最大
		operationsList.add("SetMin");// 相对值调到最小
		operationsList.add("Auto");// 自动模式
		operationsList.add("Cool");// 制冷模式
		operationsList.add("Heat");// 制热模式
		operationsList.add("Dry");// 除湿模式
		operationsList.add("Fan");// 送风模式
		operationsList.add("Horizon");// 左右摆风
		operationsList.add("HorizonOff");// 关闭左右摆风
		operationsList.add("Vertical");// 上下摆风
		operationsList.add("VerticalOff");// 关闭上下摆风
		operationsList.add("Next");// 下一个频道
		operationsList.add("Previous");// 上一个频道
		operationsList.add("Stop");// 停止
		operationsList.add("Play");// 播放
		operationsList.add("Pause");// 暂停
		return operationsList;
	}
}
