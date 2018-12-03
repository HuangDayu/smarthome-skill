package org.smarthome.skill.util;


/**
 * 语音指令类
 * @author Administrator
 *
 */
public class SkillDevicesOrderUtil {
	/***
	 * [index][0]:艾韵智能
	 * [index][1]:天猫
	 * [index][2]:百度
	 * [index][3]:出门问问
	 * [index][4]:猎豹
	 * [index][5]:若琪
	 * [index][6]:京东
	 */
	private static final String[][] cmdStrs = {
			{"TurnOn","TurnOn","TurnOnRequest","TurnOnRequest","TurnOn","Switch.On","TurnOnRequest"},//打开
		    {"TurnOff","TurnOff","TurnOffRequest","TurnOffRequest","TurnOff","Switch.Off","TurnOffRequest"},//关闭
			{"TimingTurnOn","null","TimingTurnOnRequest","null","null","null","null"},//定时打开
		    {"TimingTurnOff","null","TimingTurnOffRequest","null","null","null","null"},//定时关闭
			{"OpenTiming","null","null","null","null","null","null"},//打开定时
		    {"CloseTiming","null","null","null","null","null","null"},//关闭定时
		    {"SetTiming","null","TimingSetModeRequest","null","null","null","null"},//设置定时
		    {"SelectChannel","SelectChannel","SetTVChannelRequest","SetTargetChannelRequest","SelectChannel","Media.TVChannel.Set","SetTVChannelRequest"},//设置频道
		    {"SetMute","SetMute","SetVolumeMuteRequest","SetTargetMuteRequest","SetVolume","Mode.Silent","SetMuteRequest"},//设置静音
		    {"CancelMute","CancelMute","null","CancelTargetMuteRequest","SetVolume","Mode.Silent","SetMuteRequest"},//取消静音
		    {"Play","Play","null","null","null","PlaybackControl.Play","PlayRequest"},//播放
		    {"Pause","Pause","PauseRequest","null","Pause","PlaybackControl.Pause","PauseRequest"},//暂停
		    {"Continue","Continue","ContinueRequest","null","Continue","PlaybackControl.Play","PlayRequest"},//继续
		    {"SetBrightness","SetBrightness","SetBrightnessPercentageRequest","SetTargetBrightnessRequest","SetBrightness","Brightness.Set","SetBrightnessRequest"},//设置亮度
		    {"AdjustUpBrightness","AdjustUpBrightness","IncrementBrightnessPercentageRequest","IncrementTargetBrightnessRequest","AdjustUpBrightness","null","AdjustUpBrightnessRequest"},//调大亮度
		    {"AdjustDownBrightness","AdjustDownBrightness","DecrementBrightnessPercentageRequest","DecrementTargetBrightnessRequest","AdjustDownBrightness","null","AdjustDownBrightnessRequest"},//调小亮度
		    {"SetColor","SetColor","SetColorRequest","SetTargetColorRequest","SetColor","Color.Set","SetColorRequest"},//设置颜色
		    {"OpenFunction","OpenFunction","null","null","null","null","null"},//打开功能
		    {"CloseFunction","CloseFunction","null","null","null","null","null"},//关闭功能
		    {"Cancel","Cancel","null","null","null","null","null"},//取消
		    {"SetVolume","SetVolume","SetVolumeRequest","null","null","Volume.Set","SetVolumeRequest"},//设置音量
		    {"AdjustUpVolume","AdjustUpVolume","IncrementVolumeRequest","IncrementTargetVolumeRequest","AdjustUpVolume","null","AdjustUpVolumeRequest"},//音量+  声音调大
		    {"AdjustDownVolume","AdjustDownVolume","DecrementVolumeRequest","DecrementTargetVolumeRequest","AdjustDownVolume","null","AdjustDownVolumeRequest"},//音量-  声音调小
		    {"AdjustUpChannel","Next","IncrementTVChannelRequest","IncrementTargetChannelRequest","AdjustUpChannel","Media.TVChannel.Next","AdjustUpTVChannelRequest"},//频道+,下一首,下一台
		    {"AdjustDownChannel","Previous","DecrementTVChannelRequest","DecrementTargetChannelRequest","AdjustDownChannel","Media.TVChannel.Previous","AdjustDownTVChannelRequest"},//频道-,上一首,上一台
		    {"ReturnTVChannel","null","ReturnTVChannelRequest","null","null","null","ReturnTVChannelRequest"},//返回上个频道
		    {"SetWindSpeed","SetWindSpeed","SetFanSpeedRequest","null","SetWindSpeed","FanSpeed.Set","SetWindSpeedRequest"},//设置风速
		    {"AdjustUpWindSpeed","AdjustUpWindSpeed","IncrementFanSpeedRequest","IncrementTargetWindSpeedRequest","AdjustUpWindSpeed","null","AdjustUpWindSpeedRequest"},//调大风速
		    {"AdjustDownWindSpeed","AdjustDownWindSpeed","DecrementFanSpeedRequest","DecrementTargetWindSpeedRequest","AdjustDownWindSpeed","null","AdjustDownWindSpeedRequest"},//调小风速
		    {"SetMode","SetMode","SetModeRequest","SetTargetModeRequest","SetMode","null","SetModeRequest"},//设置模式
		    {"CancelMode","CancelMode","UnsetModeRequest","null","CancelMode","null","null"},//取消模式(退出模式)
		    {"SetTemperature","SetTemperature","SetTemperatureRequest","SetTargetTemperatureRequest","SetTemperature","Temperature.Set","SetTemperatureRequest"},//设置温度
		    {"AdjustUpTemperature","AdjustUpTemperature","IncrementTemperatureRequest","IncrementTargetTemperatureRequest","AdjustUpTemperature","null","AdjustUpTemperatureRequest"},//温度+
		    {"AdjustDownTemperature","AdjustDownTemperature","DecrementTemperatureRequest","DecrementTargetTemperatureRequest","AdjustDownTemperature","null","AdjustDownTemperatureRequest"},//温度-
		    {"SetLockStateRequest","null","null","null","null","null","null"},//设置锁的状态(目前不支持)
		    {"SubmitPrintRequest","null","SubmitPrintRequest","null","null","null","null"},//打印设备(目前不支持)
		    {"OpenSwing","OpenSwing","null","null","SetWindDirection","SwingMode.On","null"},//开启摆风  设置风向
		    {"CloseSwing","CloseSwing","null","null","SetWindDirection","SwingMode.Off","null"},//关闭摆风  设置风向
		    {"OpenHorizontalSwing","OpenLeftAndRightSwing","null","null","null","SwingMode.Horizon","null"},//开启左右摆风
		    {"CloseHorizontalSwing","CloseLeftAndRightSwing","null","null","null","SwingMode.HorizonOff","null"},//关闭左右摆风
		    {"OpenVerticalSwing","OpenUpAndDownSwing","null","null","null","SwingMode.Vertical","null"},//开启上下摆风
		    {"CloseVerticalSwing","CloseUpAndDownSwing","null","null","null","SwingMode.VerticalOff","null"},//关闭上下摆风
		    {"OpenNegativeIons","null","null","null","null","null","null"},//打开负离子
		    {"CloseNegativeIons","null","null","null","null","null","null"},//关闭负离子
		    {"OpenMenu","null","null","null","null","null","null"},//打开菜单
		    {"CloseMenu","null","null","null","null","null","null"},//关闭菜单
		    {"Speed","null","null","null","null","null","null"},//快进
		    {"Setreat","null","null","null","null","null","null"},//后退
		    {"SetSignal","null","null","null","null","null","null"},//设置信号源
		    {"OpenDiscBin","null","null","null","null","null","null"},//打开碟仓
		    {"CloseDiscBin","null","null","null","null","null","null"},//关闭碟仓
		    {"OpenChildLock","null","null","null","null","null","null"},//打开童锁
		    {"CloseChildLock","null","null","null","null","null","null"},//关闭童锁
		    {"Amplify","null","null","null","null","null","null"},//放大
		    {"Reduce","null","null","null","null","null","null"},//缩小
		    {"OpenMediumTemp","null","null","null","null","null","null"},//打开保温
		    {"CloseMediumTemp","null","null","null","null","null","null"},//关闭保温  
		    {"SetWindClass","null","null","null","null","null","null"},//设置风类 
		    {"Return","null","null","null","null","null","null"},//返回
		    {"Ok","null","null","null","null","null","null"},//确认
		    {"SetHumidity","null","null","null","SetHumidity","Humidity.Set","null"},//设置湿度
		    {"AdjustUpHumidity","null","null","null","AdjustUpHumidity","null","null"},//调大湿度
		    {"AdjustDownHumidity","null","null","null","AdjustDownHumidity","null","null"},//调小湿度
		    {"SetMaxTemp","null","null","null","null","Temperature.SetMax","null"},//最高温度
		    {"SetMinTemp","null","null","null","null","Temperature.SetMin","null"},//最低温度
		    {"SetMaxFan","null","null","null","null","FanSpeed.SetMax","null"},//最高风速
		    {"SetMinFan","null","null","null","null","FanSpeed.SetMin","null"},//最低风速
		    {"GetPowerState","null","null","null","null","null","QueryPowerStateRequest"},//查询电源状态
		    {"GetTemperature","null","null","null","null","null","QueryTemperatureRequest"},//查询当前温度
		    {"GetMode","null","null","null","null","null","QueryModeRequest"},//查询当前模式 
		    {"GetWindSpeed","null","null","null","null","null","QueryWindspeedRequest"},//查询风速 
		    {"GetValue","null","null","null","null","null","null"},//查询当前值
		    {"SetMaxBrightness","null","null","null","null","Brightness.SetMax","null"},//最高亮度
		    {"SetMinBrightness","null","null","null","null","Brightness.SetMin","null"},//最低亮度
		    {"SetMaxVolume","null","null","null","null","Volume.SetMax","null"},//最高音量
		    {"SetMinVolume","null","null","null","null","Volume.SetMin","null"},//最低音量
		    {"SetMaxHumidity","null","null","null","null","Humidity.SetMax","null"},//最高湿度
		    {"SetMinHumidity","null","null","null","null","Humidity.SetMin","null"},//最低湿度
		    };//共78个指令

	/**
	 * 获取艾韵操作指令
	 * 
	 * @param cmd
	 * @param type
	 *            类型 0.艾韵 1.天猫 2.百度 3.出门问问  4.猎豹 5.若琪
	 * @return
	 */
	public static String getAiyunCmd(String cmd, int type) {
		for (int i = 0; i < cmdStrs.length; i++) {
			if (cmdStrs[i][type].equals(cmd)) {
				if (!cmdStrs[i][0].equals("null")) {
					return cmdStrs[i][0];
				}
			}
		}
		System.out.println("【重要错误】 技能平台 " + type + " 命令转艾韵命令失败：" + cmd);
		return cmd;
	}

	public static void main(String[] args) {
		int len = 7;
		for (int i = 0; i < cmdStrs.length; i++) {
			if (cmdStrs[i].length != len) {
				System.out.println(cmdStrs[i][0]);
				return;
			}
		}
		System.out.println(cmdStrs.length + "-" + getAiyunCmd("SetModeRequest", len - 1));
	}
}
