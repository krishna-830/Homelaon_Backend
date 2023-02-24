package com.myhomeloan.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myhomeloan.model.Cibil;
import com.myhomeloan.model.Customer;
import com.myhomeloan.service.CustomerService;

import lombok.Getter;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
    
	
	@GetMapping("/checkCibilStauts")
	public List<Cibil> checkCibilStatus(){
		return customerService.getallCibil();
	}
	
	
	
	
	@PostMapping("/saveCustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
		Customer customer2 = customerService.SaveCustomer(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(customer2);
	}

	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> saveCustomer() {
		List<Customer> list = customerService.getAllCustomer();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/getCustomerByID/{eID}")
	public ResponseEntity<Customer> getCustomerByID(@PathVariable int eID) {
		Customer customer = customerService.getCustomerById(eID);
		return ResponseEntity.ok(customer);
	}

	@DeleteMapping("/deleteCustomer/{eID}")
	public ResponseEntity<String> DeleteCustomer(@PathVariable int eID) {
		customerService.deleteCustomer(eID);

		return ResponseEntity.ok("deleted");
	}

	@PutMapping("/updateCustomer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		Customer customer2 = customerService.updateCustomer(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(customer2);
	}

}
