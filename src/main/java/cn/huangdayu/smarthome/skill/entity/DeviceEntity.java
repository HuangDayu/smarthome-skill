package cn.huangdayu.smarthome.skill.entity;

import java.util.List;

import cn.huangdayu.smarthome.skill.enums.DeviceTypeEnum;

public class DeviceEntity {
	/** 用户uid **/
	private String uid;
	/** 网关子设备，万能遥控子设备，者场景类型 **/
	private DeviceTypeEnum deviceType;
	/** 设备是否在线 **/
	private boolean isReachable;
	/** 厂家名称 **/
	private String manufacturerName;
	/** 设备型号 **/
	private String modelName;
	/** 固件版本 **/
	private String version;
	/** 位置 **/
	private String place;
	/** 设备ID **/
	private String deviceId;
	/** 设备命名 **/
	private String deviceName;
	/** 子设备ID：网关子设备，遥控子设备  可以为空**/
	private String subDeviceId;
	/** 硬件SN序号 **/
	private String hardwareSN;
	/** 子硬件SN序号 **/
	private String subHardwareSN;
	/** 创建时间 **/
	private String createTime;
	/** 最新改动或者执行时间 **/
	private String lastTime;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public DeviceTypeEnum getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(DeviceTypeEnum deviceType) {
		this.deviceType = deviceType;
	}
	public boolean isReachable() {
		return isReachable;
	}
	public void setReachable(boolean isReachable) {
		this.isReachable = isReachable;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getSubDeviceId() {
		return subDeviceId;
	}
	public void setSubDeviceId(String subDeviceId) {
		this.subDeviceId = subDeviceId;
	}
	public String getHardwareSN() {
		return hardwareSN;
	}
	public void setHardwareSN(String hardwareSN) {
		this.hardwareSN = hardwareSN;
	}
	public String getSubHardwareSN() {
		return subHardwareSN;
	}
	public void setSubHardwareSN(String subHardwareSN) {
		this.subHardwareSN = subHardwareSN;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getLastTime() {
		return lastTime;
	}
	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}
	
}
