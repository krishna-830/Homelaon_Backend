package com.myhomeloan.Controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("credit-api")
public class CreditController 
{
     
	@GetMapping("/check")
	public String CheckApp()
	{
		
		return "App Working Fine";
		
	}
	
	
	
}
