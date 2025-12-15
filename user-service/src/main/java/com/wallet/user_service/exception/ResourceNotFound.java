package com.wallet.user_service.exception;

public class ResourceNotFound extends RuntimeException {
	
	private String msg;

	public ResourceNotFound(String msg) {
		super(msg);
	}
	
}
