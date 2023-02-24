package com.myhomeloan.Payload;



import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
private String msg;
private boolean success;
private HttpStatus status;

	
}
