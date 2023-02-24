package com.myhomeloan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myhomeloan.Service.LoanDisbursementService;
import com.myhomeloan.model.LoanDisbursement;

@RestController
@RequestMapping("/accouthead-api")
public class LoandisbursementController {

	@Autowired
	private LoanDisbursementService service;

	public ResponseEntity<LoanDisbursement> createLoanDisbursementFile(@RequestBody LoanDisbursement loan) {

		LoanDisbursement loandis = service.createLoanDisbursementFile(loan);

		return ResponseEntity.status(HttpStatus.CREATED).body(loandis);
	}
}
