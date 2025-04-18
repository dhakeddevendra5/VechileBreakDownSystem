package com.app.Exception;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(String umsg) {
		super(umsg);
	}

}
