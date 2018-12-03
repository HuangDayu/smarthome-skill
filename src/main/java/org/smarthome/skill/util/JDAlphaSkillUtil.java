package org.smarthome.skill.util;

import java.util.ArrayList;
import java.util.List;

public class JDAlphaSkillUtil {

	public static List<String> getJDAlphaCmdList(int type) {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOn");// 打开
		actionsList.add("TurnOff");// 关闭
		actionsList.add("QueryPowerState");// 查询设备打开状态
		switch (type) {
		case 1:// 空调
			actionsList.add("AdjustUpTemperature");// 升高温度
			actionsList.add("AdjustDownTemperature");// 降低温度
			actionsList.add("SetTemperature");// 设置温度
			actionsList.add("AdjustUpWindSpeed");// 增加风速
			actionsList.add("AdjustDownWindSpeed");// 减小风速
			actionsList.add("SetWindSpeed");// 设置风速
			actionsList.add("SetMode");// 设置模式
			actionsList.add("QueryTemperature");// 读取温度
			actionsList.add("QueryWindspeed");// 查询风速
			break;
		case 2:// 电视机
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			actionsList.add("ReturnTVChannel");// 返回上一个频道
			actionsList.add("SetMute");// 设置静音
			break;
		case 3:// 机顶盒
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			actionsList.add("ReturnTVChannel");// 返回上一个频道
			actionsList.add("SetMute");// 设置静音
			break;
		case 4:// DVD
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			actionsList.add("ReturnTVChannel");// 返回上一个频道
			actionsList.add("SetMute");// 设置静音
			break;
		case 5:// 风扇
			actionsList.add("AdjustUpWindSpeed");// 增加风速
			actionsList.add("AdjustDownWindSpeed");// 减小风速
			actionsList.add("SetWindSpeed");// 设置风速
			actionsList.add("SetMode");// 设置模式
			break;
		case 6:// 空气进化器
			actionsList.add("AdjustUpWindSpeed");// 增加风速
			actionsList.add("AdjustDownWindSpeed");// 减小风速
			actionsList.add("SetWindSpeed");// 设置风速
			actionsList.add("SetMode");// 设置模式
			break;
		case 7:// 电视盒子
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			actionsList.add("ReturnTVChannel");// 返回上一个频道
			actionsList.add("SetMute");// 设置静音
			break;
		case 8:// 投影仪
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			actionsList.add("ReturnTVChannel");// 返回上一个频道
			actionsList.add("SetMute");// 设置静音
			break;
		case 9:// 音响
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			actionsList.add("ReturnTVChannel");// 返回上一个频道
			actionsList.add("SetMute");// 设置静音
			break;
		case 10:// 热水器
			actionsList.add("AdjustUpTemperature");// 升高温度
			actionsList.add("AdjustDownTemperature");// 降低温度
			actionsList.add("SetTemperature");// 设置温度
			actionsList.add("SetMode");// 设置模式
			actionsList.add("QueryTemperature");// 查询温度
			break;
		default:
			break;
		}
		return actionsList;
	}

	public static List<String> getControlSpeechList(int type) {
		List<String> actionsList = new ArrayList<String>();
		actionsList.add("TurnOn");// 打开
		actionsList.add("TurnOff");// 关闭
		actionsList.add("QueryPowerState");// 查询设备打开状态
		switch (type) {
		case 1:// 空调
			actionsList.add("AdjustUpTemperature");// 升高温度
			actionsList.add("AdjustDownTemperature");// 降低温度
			actionsList.add("SetTemperature");// 设置温度
			actionsList.add("AdjustUpWindSpeed");// 增加风速
			actionsList.add("AdjustDownWindSpeed");// 减小风速
			actionsList.add("SetWindSpeed");// 设置风速
			actionsList.add("SetMode");// 设置模式
			actionsList.add("QueryTemperature");// 读取温度
			actionsList.add("QueryWindspeed");// 查询风速
			break;
		case 2:// 电视机
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("SetVolumeMute");// 设置设备静音状态
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			actionsList.add("ReturnTVChannel");// 返回上一个频道
			break;
		case 3:// 机顶盒
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("SetVolumeMute");// 设置设备静音状态
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			actionsList.add("ReturnTVChannel");// 返回上一个频道
			break;
		case 4:// DVD
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("SetVolumeMute");// 设置设备静音状态
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			actionsList.add("ReturnTVChannel");// 返回上一个频道
			break;
		case 5:// 风扇
			actionsList.add("AdjustUpWindSpeed");// 增加风速
			actionsList.add("AdjustDownWindSpeed");// 减小风速
			actionsList.add("SetWindSpeed");// 设置风速
			actionsList.add("SetMode");// 设置模式
			break;
		case 6:// 空气进化器
			actionsList.add("AdjustUpWindSpeed");// 增加风速
			actionsList.add("AdjustDownWindSpeed");// 减小风速
			actionsList.add("SetWindSpeed");// 设置风速
			actionsList.add("SetMode");// 设置模式
			break;
		case 7:// 电视盒子
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("SetVolumeMute");// 设置设备静音状态
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			actionsList.add("ReturnTVChannel");// 返回上一个频道
			break;
		case 8:// 投影仪
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("SetVolumeMute");// 设置设备静音状态
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			break;
		case 9:// 音响
			actionsList.add("AdjustUpVolume");// 调高音量
			actionsList.add("AdjustDownVolume");// 调低音量
			actionsList.add("AdjustUpTVChannel");// 上一个频道
			actionsList.add("AdjustDownTVChannel");// 下一个频道
			actionsList.add("SetVolume");// 设置音量
			actionsList.add("SetTVChannel");// 设置频道
			actionsList.add("SetVolumeMute");// 设置设备静音状态
			actionsList.add("Stop");// 暂停
			actionsList.add("Play");// 继续
			actionsList.add("ReturnTVChannel");// 返回上一个频道
			break;
		case 10:
			actionsList.add("AdjustUpTemperature");// 升高温度
			actionsList.add("AdjustDownTemperature");// 降低温度
			actionsList.add("SetTemperature");// 设置温度
			actionsList.add("SetMode");// 设置模式
			actionsList.add("QueryTemperature");// 查询温度
			break;
		default:
			break;
		}
		return actionsList;
	}

}
