package com.pack1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateBookResponse {
	
	@JsonProperty("Msg")
	private String msg;
	
	@JsonProperty("ID")
	private String iD;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	

	
	
	

}
