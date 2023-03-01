package com.myhomeloan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myhomeloan.Service.LoanDisbursementService;
import com.myhomeloan.model.LoanDisbursement;

@RestController
@RequestMapping("/acdis-api")
public class LoandisbursementController {

	@Autowired
	private LoanDisbursementService service;
   
	@PostMapping("/createLoanDisbursementFile")
	public ResponseEntity<LoanDisbursement> createLoanDisbursementFile(@RequestBody LoanDisbursement loan) {

		LoanDisbursement loandis = service.createLoanDisbursementFile(loan);

		return ResponseEntity.status(HttpStatus.CREATED).body(loandis);
	}
	
	@GetMapping("/getAllLoanDisbursement")
	public ResponseEntity<List<LoanDisbursement>> getAllLoanDisbursement()
	{
		  List<LoanDisbursement>  llist= service.getAllLoanDisbursement();
		  
		  return new ResponseEntity<List<LoanDisbursement>>(llist,HttpStatus.OK);
	}
}
