package com.myhomeloan.ExceptionHandler;

import javax.naming.NameNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.myhomeloan.payload.ApiResponse;

@RestControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(NameInvalidException.class)
	public ResponseEntity<String> NameInvalidExceptionhandeler(NameInvalidException ex) {

		return new ResponseEntity<String>("Id Not Valid..", HttpStatus.BAD_REQUEST);
	}

	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotfound(ResourceNotFoundException ex){
		String message = ex.getMessage();
		ApiResponse response = new ApiResponse(message,true,HttpStatus.NOT_FOUND);
		return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
	}

}
