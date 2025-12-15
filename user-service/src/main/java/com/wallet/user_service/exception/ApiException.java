package com.wallet.user_service.exception;

public class ApiException extends RuntimeException{
	public String msg;

	public ApiException(String msg) {
		super(msg);
	}
	
}
