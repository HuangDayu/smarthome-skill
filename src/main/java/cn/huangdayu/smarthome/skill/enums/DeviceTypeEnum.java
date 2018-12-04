package cn.huangdayu.smarthome.skill.enums;

/**
 * 设备类型
 * 
 * @author Administrator
 *
 */
public enum DeviceTypeEnum {
	OMNIPOTENT_IR, // 万能红外
	OMNIPOTENT_IR_AC, // 红外空调
	OMNIPOTENT_IR_TV, // 红外电视
	OMNIPOTENT_IR_STB, // 红外机顶盒
	OMNIPOTENT_IR_DVD, // 红外DVD
	OMNIPOTENT_IR_FAN, // 红外电风扇
	OMNIPOTENT_IR_AP, // 红外空气净化器
	OMNIPOTENT_IR_IPTV, // 红外电视盒子
	OMNIPOTENT_IR_PJ, // 红外投影仪
	OMNIPOTENT_IR_AS, // 红外音响
	OMNIPOTENT_IR_WH, // 红外热水器
	GETWAY, // 网关
	GETWAY_SOCKET, // 网关子设备 插座
	GETWAY_SWITCH, // 网关子设备 开关
	GETWAY_CURTAIN, // 网关子设备 窗帘
	// 以百度DuerOS为例
	ACTIVITY_TRIGGER, // 描述特定设备的组合场景。场景中的设备必须以指定顺序操作。
	SCENE_TRIGGER, // 描述特定设备的
	LIGHT, // 电灯类设备
	SWITCH, // 开关类设备
	SOCKET, // 插座类设备
	CURTAIN, // 窗帘类设备
	AOMNIPOTENT_IR_CONDITION, // 空调类设备
	TV_SET, // 电视机
	SET_TOP_BOX, // 机顶盒
	AOMNIPOTENT_IR_MONITOR, // 空气监测器类设备
	AOMNIPOTENT_IR_PURIFIER, // 空气净化器
	WATER_PURIFIER, // 净水器
	HUMIDIFIER, // 加湿器
	FAN, // 电风扇
	WATER_HEATER, // 热水器类设备
	HEATER, // 电暖器类设备
	WASHING_MACHINE, // 洗衣机类设备
	CLOTHES_RACK, // 晾衣架
	GAS_STOVE, // 燃气灶类设备
	RANGE_HOOD, // 油烟机类设备
	OVEN, // 烤箱设备
	MICROWAVE_OVEN, // 微波炉
	PRESSURE_COOKER, // 压力锅
	RICE_COOKER, // 电饭煲
	INDUCTION_COOKER, // 电磁炉
	HIGH_SPEED_BLENDER, // 破壁机
	SWEEPING_ROBOT, // 扫地机器人
	FRIDGE, // 冰箱
	PRINTER, // 打印机
	IR_FRESHER, // 新风机
	KETTLE, // 热水壶
	WEBCAM, // 摄像头
	ROBOT, // 机器人
	WINDOW_OPENER;// 开窗器

	public static DeviceTypeEnum getEnum(String v) {
		for (DeviceTypeEnum deviceTypeEnum : DeviceTypeEnum.values()) {
			if (deviceTypeEnum.toString().equals(v)) {
				return deviceTypeEnum;
			}
		}
		return null;
	}
}
