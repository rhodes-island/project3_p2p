package com.demo.p2p.base.util;


public class JSONResult {
	private boolean success = true;
	private String msg;

	public JSONResult() {
		super();
	}

	@Override
	public String toString() {
		return "JSONResult [success=" + success + ", msg=" + msg + "]";
	}

	public JSONResult(String msg) {
		super();
		this.msg = msg;
	}

	public JSONResult(Boolean success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
