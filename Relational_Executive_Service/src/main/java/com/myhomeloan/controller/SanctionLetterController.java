package com.myhomeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.myhomeloan.service.SanctionLetterService;

@RestController
@RequestMapping("/sanctionletter")
public class SanctionLetterController {
	@Autowired
	private SanctionLetterService service;
	
}
