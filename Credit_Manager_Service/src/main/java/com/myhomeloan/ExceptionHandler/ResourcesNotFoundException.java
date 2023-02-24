package com.myhomeloan.ExceptionHandler;

public class ResourcesNotFoundException extends RuntimeException{
 
	
	
	public ResourcesNotFoundException()
	{
		super("Resources Not Found");
		
		
	}
	
	
	public ResourcesNotFoundException(String msg)
	{
		super(msg);
	}
}
