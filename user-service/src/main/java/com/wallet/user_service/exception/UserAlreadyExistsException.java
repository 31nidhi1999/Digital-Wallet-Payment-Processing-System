package com.wallet.user_service.exception;

public class UserAlreadyExistsException extends RuntimeException{
	public String msg;

	public UserAlreadyExistsException(String msg) {
		super(msg);
	}
	
}
