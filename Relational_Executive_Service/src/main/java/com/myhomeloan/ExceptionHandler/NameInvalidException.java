package com.myhomeloan.ExceptionHandler;

public class NameInvalidException extends RuntimeException {

	public NameInvalidException() {
		super("Invaild Name , please enter valid name");
		
	}

	public NameInvalidException(String message) {
		super(message);
		
	}
	
	
	

}
