package cn.huangdayu.smarthome.skill.dto;

import cn.huangdayu.smarthome.skill.enums.ResultEnum;

public class ResultDTO<T> {
	private int code;
	private String msg;
	private Object data;

	private ResultDTO(ResultEnum result) {
		this.code = result.getCode();
		this.msg = result.getMsg();
	}
	
	private ResultDTO(ResultEnum result,Object data) {
		this.code = result.getCode();
		this.msg = result.getMsg();
		this.data = data;
	}

	public static ResultDTO<?> entiey(int code,Object... data) {
		if(data.length>0) {
			return new ResultDTO<Object>(ResultEnum.getEnum(code),data);
		}else {
			return new ResultDTO<ResultEnum>(ResultEnum.getEnum(code));
		}
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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
