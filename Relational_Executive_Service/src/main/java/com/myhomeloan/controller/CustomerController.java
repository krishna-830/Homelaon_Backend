package com.myhomeloan.controller;

import java.util.List;

import javax.mail.Multipart;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.myhomeloan.dto.CustomerDTO;
import com.myhomeloan.model.AllPersonalDocs;
import com.myhomeloan.model.Cibil;
import com.myhomeloan.model.Customer;
import com.myhomeloan.service.CustomerService;

import lombok.Getter;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping("/checkCibilStauts")
	public ResponseEntity<String> checkEligibility() {
		String string = customerService.getallCibil();
	        System.out.println("RE :   "+string);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(string);
	}

	/* Save Dummy Customer without Document */
	@PostMapping("/saveCustomerwithoutdacument")
	public ResponseEntity<Customer> saveCustomer(@RequestBody CustomerDTO customer) {
		Customer customer2 = customerService.SaveCustomer(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(customer2);
	}

	@PostMapping("/setDocument/{eID}")
	public ResponseEntity<Customer> setDocument(@RequestPart MultipartFile addressproof,
			@RequestPart MultipartFile pancard, @RequestPart MultipartFile itr, @RequestPart MultipartFile adharcard,
			@RequestPart MultipartFile photo, @RequestPart MultipartFile signature,
			@RequestPart MultipartFile bankcheque, @RequestPart MultipartFile salaryslips, @PathVariable int eID) {
		Customer customer=null;
		try {
			AllPersonalDocs doc = new AllPersonalDocs();
			doc.setAddharCard(adharcard.getBytes());
			doc.setAddressproof(addressproof.getBytes());
			doc.setBankcheque(bankcheque.getBytes());
			doc.setItr(itr.getBytes());
			doc.setPancard(pancard.getBytes());
			doc.setPhoto(photo.getBytes());
			doc.setSalaryslips(salaryslips.getBytes());
			doc.setSignature(signature.getBytes());
			 customer = customerService.findByEID(eID);
			customer.setCAllPersonalDocs(doc);
		} catch (Exception e) {
			
		}

		return ResponseEntity.status(HttpStatus.CREATED).body(customerService.SaveCustomerwithDocument(customer));
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
