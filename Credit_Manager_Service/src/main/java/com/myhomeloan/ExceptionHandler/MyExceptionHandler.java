package com.myhomeloan.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.myhomeloan.Payload.ApiResponse;

@RestControllerAdvice
public class MyExceptionHandler {

	
	public ResponseEntity<ApiResponse> HandlerResourcesNotFound(ResourcesNotFoundException ex)
	{
	String msg=ex.getMessage();
	
	ApiResponse  response=new ApiResponse(msg , true , HttpStatus.NOT_FOUND);
	return new ResponseEntity<ApiResponse>(response , HttpStatus.NOT_FOUND);
	
	}
}
