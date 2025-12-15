package com.wallet.user_service.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	private String msg;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
	
}
