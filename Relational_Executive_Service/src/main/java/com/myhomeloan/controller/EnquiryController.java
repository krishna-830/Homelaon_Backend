package com.myhomeloan.controller;

import java.util.List;

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

import com.myhomeloan.model.Enquiry_Details;
import com.myhomeloan.service.EnquiryService;

@RestController
@RequestMapping("/Enquiries")
public class EnquiryController {

	@Autowired
	private EnquiryService Service;
	
	@PostMapping("/addEnquiry")
	public ResponseEntity<Enquiry_Details> CreateEnquiry(@RequestBody Enquiry_Details enquiry_details) {
		
		Enquiry_Details Enquiry_Details = Service.SaveEnquiry(enquiry_details);
		return ResponseEntity.status(HttpStatus.CREATED).body(Enquiry_Details) ;
	}
	@GetMapping("/getAllEnquiry")
	public ResponseEntity<List<Enquiry_Details>> getAllEnquiry(){
		
		List<Enquiry_Details> allenquiry = Service.getAllEnquiry();
		
		return ResponseEntity.ok(allenquiry);
	}
	
	@GetMapping("/getEnquiry/{eid}")
	public ResponseEntity<Enquiry_Details> getEnquiry(@PathVariable int eid){
		Enquiry_Details Enquiry_Details = Service.getEnquiry(eid);
		return ResponseEntity.status(HttpStatus.OK).body(Enquiry_Details);
	}
	
	
	@DeleteMapping("/deleteEnquiry/{eid}")
	public ResponseEntity<String> deleteEnquiry(@PathVariable int eid){
		Enquiry_Details Enquiry_Details = Service.deleteEnquiry(eid);
		if(Enquiry_Details==null) {
			System.out.println(HttpStatus.NOT_FOUND );
		}
		else {
			System.out.println(HttpStatus.FOUND);
		}
		return new ResponseEntity<String>("Enquiry Deleted", HttpStatus.FOUND);
		
	}
	
}
