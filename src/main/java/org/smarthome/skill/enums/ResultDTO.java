package org.smarthome.skill.enums;

public enum ResultDTO {
	CONTROL_SUCCESS(1, "控制成功"), 
	NO_SUCH_DEVICE(-1, "无此设备"),
	EQUIPMENT_OFFLINE(-2, "设备离线"),
	EQUIPMENT_FAILURE(-3, "设备故障"), 
	PARAMETER_ERROR(-4, "参数错误"), 
	SERVICE_FAILURE(-5, "服务故障"), 
	UNKNOWN_ERROR(-6, "未知错误");

	private int code;
	private String msg;

	private ResultDTO(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public static ResultDTO entiey(int code) {
		for (ResultDTO resultDTO : ResultDTO.values()) {
			if (resultDTO.getCode() == code) {
				return resultDTO;
			}
		}
		return null;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
