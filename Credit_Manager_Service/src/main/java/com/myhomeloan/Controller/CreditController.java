package com.myhomeloan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myhomeloan.Model.CustomerVarification;
import com.myhomeloan.Model.SanctionLatter;
import com.myhomeloan.Service.CreditService;

@RestController
@RequestMapping("credit-api")
public class CreditController {
	@Autowired
	private CreditService service;

	@GetMapping("/check")
	public String check() {
		return "App Working";
	}
	
	
	@GetMapping("/getAllCustomer")
	public ResponseEntity<Customer> getAllCustomer()
	{
		return new ResponseEntity<Customer>(cus , HttpStatus.FOUND);
	}

	@PostMapping("/savevarification")
	public ResponseEntity<CustomerVarification> saveCustomerVarification(
			@RequestBody CustomerVarification customerVarification) {

		CustomerVarification cusvarified = service.savevarification(customerVarification);

		return new ResponseEntity<CustomerVarification>(cusvarified, HttpStatus.CREATED);
	}

	@GetMapping("/getVarification/{varId}")
	public ResponseEntity<CustomerVarification> getVarification(@PathVariable int varId) {

		CustomerVarification cusvarification = service.getVarification(varId);
		return new ResponseEntity<CustomerVarification>(cusvarification, HttpStatus.OK);
	}

	@DeleteMapping("/cancelVarification/{varid}")
	public ResponseEntity<String> cancelVarification(@PathVariable int varid) {
		String msg = service.deleteVarification(varid);
		return new ResponseEntity<String>(msg, HttpStatus.ACCEPTED);

	}
	@PostMapping("/createSanction")
	public ResponseEntity<SanctionLatter> createSanctionlatter(@RequestBody SanctionLatter sl)
	{
	
		SanctionLatter   sanclet  = service.createSanctionLatter(sl);
		
		return new ResponseEntity<SanctionLatter>(sanclet, HttpStatus.CREATED);
		
	}

}
