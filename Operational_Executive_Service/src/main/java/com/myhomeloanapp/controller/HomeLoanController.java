package com.myhomeloanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myhomeloanapp.model.Cibil;
import com.myhomeloanapp.service.HomeLoanService;

@RestController
@RequestMapping("/Ope_Api")
public class HomeLoanController {
	@Autowired
	private HomeLoanService service;
	
	@GetMapping("/Check")
	public ResponseEntity<String> Check(){
		return new ResponseEntity<String>("Cibil Checking!!",HttpStatus.OK);
	}
	
	@PostMapping("/saveCibilScore")
	public ResponseEntity<Cibil> saveCibilScore(@RequestBody Cibil cibil){
		
		return new ResponseEntity<Cibil>(service.saveCibilScore(cibil), HttpStatus.ACCEPTED);
	}

}
