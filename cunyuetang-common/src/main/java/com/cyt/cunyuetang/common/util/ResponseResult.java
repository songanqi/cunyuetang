package com.cyt.cunyuetang.common.util;

import java.util.HashMap;
import java.util.Map;

public class ResponseResult extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public ResponseResult() {
		put("code", 200);
		put("msg", "操作成功");
	}
	
	public static ResponseResult error() {
		return error(500, "网络异常,请稍后重试！");
	}
	
	public static ResponseResult error(String msg) {
		return error(500, msg);
	}
	
	public static ResponseResult error(int code, String msg) {
		ResponseResult responseResult = new ResponseResult();
		responseResult.put("code", code);
		responseResult.put("msg", msg);
		return responseResult;
	}


	public static ResponseResult ok(String msg) {
		ResponseResult responseResult = new ResponseResult();
		responseResult.put("msg", msg);
		return responseResult;
	}
	
	public static ResponseResult ok(Map<String, Object> map) {
		ResponseResult responseResult = new ResponseResult();
		responseResult.putAll(map);
		return responseResult;
	}
	
	public static ResponseResult ok() {
		return new ResponseResult();
	}

	@Override
	public ResponseResult put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
