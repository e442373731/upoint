package com.util;

public class ResponseData {
	private Object data;
	
	public ResponseData(Object data){
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
