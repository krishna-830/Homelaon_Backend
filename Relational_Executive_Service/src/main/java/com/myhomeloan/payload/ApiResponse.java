package com.myhomeloan.payload;

import org.springframework.http.HttpStatus;

public class ApiResponse {
private String msg;
private boolean success;
private HttpStatus status;
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public boolean isSuccess() {
	return success;
}
public void setSuccess(boolean success) {
	this.success = success;
}
public HttpStatus getStatus() {
	return status;
}
public void setStatus(HttpStatus status) {
	this.status = status;
}
@Override
public String toString() {
	return "ApiResponse [msg=" + msg + ", success=" + success + ", status=" + status + "]";
}
public ApiResponse(String msg, boolean success, HttpStatus status) {
	super();
	this.msg = msg;
	this.success = success;
	this.status = status;
}
public ApiResponse() {
	super();
	// TODO Auto-generated constructor stub
}



}
