package com.wallet.user_service.exception;

public class UserNotFoundException extends RuntimeException {
	
	private String msg;

	public UserNotFoundException(String msg) {
		super(msg);
	}
	
}
