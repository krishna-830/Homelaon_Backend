package com.myhomeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.myhomeloan.service.SanctionLetterService;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import com.myhomeloan.model.*;
@RestController
@RequestMapping("/sanctionletter")
public class SanctionLetterController {
	@Autowired
	private SanctionLetterService service;
	
	@GetMapping("/saveSanctionLetter")
	public String saveSanctionLetter() {
	  	return service.saveSanctionLetter();
	}
	@GetMapping("/getAllSanctionLetter")
	public ResponseEntity<List<SanctionLetter>> getAllSanctionLetter(){
		List<SanctionLetter> list = service.getAllSanctionLetter();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
}
