package com.myhomeloan.ExceptionHandler;

import javax.naming.NameNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class MyExceptionHandler {
	

		@ExceptionHandler(NameInvalidException.class)
	public ResponseEntity<String> NameInvalidExceptionhandeler(NameInvalidException ex) {
			
			
			return new ResponseEntity<String>("Id Not Valid..",HttpStatus.BAD_REQUEST);
		}

	@org.springframework.web.bind.annotation.ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<String> nameinvalidException() {
	return new ResponseEntity<String>("Name Invalid Exception",HttpStatus.BAD_REQUEST);
	}
	
	

}
