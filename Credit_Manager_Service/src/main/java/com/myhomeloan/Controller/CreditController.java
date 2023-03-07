package com.myhomeloan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myhomeloan.Model.Customer;
import com.myhomeloan.Model.CustomerVarification;

import com.myhomeloan.Model.SanctionLetter;
import com.myhomeloan.Service.CreditService;

@RestController
@RequestMapping("credit-api")
@CrossOrigin("*")
public class CreditController {
	@Autowired
	private CreditService service;

	@GetMapping("/check")
	public String check() {
		return "App Working";
	}

//I want All Customer For Verification i gate this from OE by feign client and then check verification and send the status
// Then create the Sanction letter and send to OE 

	// GetAll Customer

	@GetMapping("/savecustomer")
	public ResponseEntity<String> saveCustomer() {

		String msg = service.saveCustomer();
		return new ResponseEntity<String>(msg, HttpStatus.ACCEPTED);

	}

	@PostMapping("/savevarification")
	public ResponseEntity<CustomerVarification> saveCustomerVarification(
			@RequestBody CustomerVarification customerVarification) {

		CustomerVarification cusvarified = service.savevarification(customerVarification);

		return new ResponseEntity<CustomerVarification>(cusvarified, HttpStatus.CREATED);
	}

	// with Some Customer Field
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
	public ResponseEntity<SanctionLetter> createSanctionletter(@RequestBody SanctionLetter sl) {

		SanctionLetter sanclet = service.createSanctionLatter(sl);

		return new ResponseEntity<SanctionLetter>(sanclet, HttpStatus.CREATED);

	}

	@GetMapping("/getAllSanctionLetter")
	public ResponseEntity<List<SanctionLetter>> getSanctionLetter() {

	   List<SanctionLetter> list = service.getSanctionLetter();

		return new ResponseEntity<List<SanctionLetter>>(list, HttpStatus.ACCEPTED);
	}

}
