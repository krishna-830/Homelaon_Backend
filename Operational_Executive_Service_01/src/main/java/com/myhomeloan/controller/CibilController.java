package com.myhomeloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.myhomeloan.model.Cibil;
import com.myhomeloan.model.Customer;
import com.myhomeloan.model.Enquiry_Details;
import com.myhomeloan.service.CibilService;


@RestController
@RequestMapping("/Ope-Api")
@CrossOrigin("*")
public class CibilController {
    
	
	@Autowired
	private CibilService service;
	
	@GetMapping("/setCibilStatus")
	public String setCibilStatus() {
		
		ResponseEntity<List<Enquiry_Details>> enqlist=service.getAllEnquiry();
		System.out.println(enqlist);
		List<Enquiry_Details> listof_Enquiry = enqlist.getBody();
		
	   for(Enquiry_Details en:listof_Enquiry) { 
			 if(checkMyEnquiryByid(en.getEid())) {
					Enquiry_Details enquiry= saveEnquiry(en);
					Cibil c = new Cibil();			
					int min =600;
					int max =900;
			int cibilscore=	(int)Math.random()*(max-min+1)+min;
					c.setCibilScore(cibilscore);
					c.setStatus("Okay");
					c.setRemarks("Good");
					c.setEid(c.getEid());
					Cibil cibilsaved=saveCibil(c);
			 }else {
				
			}	
		 }	return "ok";
	}
	
	private boolean checkMyEnquiryByid(int eid) {
		return service.checkMyEnquiryByid(eid);
	}

	private Cibil saveCibil(Cibil c) {
		return service.saveCibil(c);
	}

	private Enquiry_Details saveEnquiry(Enquiry_Details en) {
		return service.saveEnquiry(en);
		
	}

	@ResponseStatus
	@GetMapping("/getAllCibilStatus")
	 public ResponseEntity<List<Cibil>> getAllCibilStatus(){
		List<Cibil> allCibilStatus = service.getAllCibilStatus();
		System.out.println(allCibilStatus);
		 return new ResponseEntity<>(allCibilStatus,HttpStatus.FOUND);
		 }
	
	
	@GetMapping("/getAllCibilStatuses")
	 public List<Cibil> getAllCibilStatuses(){
		System.out.println("inside getAllCibilStatuses");
		List<Cibil> allCibilStatus = service.getAllCibilStatuses();
		System.out.println(allCibilStatus);
		 return allCibilStatus;
		 }

	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		List<Customer> allCustomer = service.getAllCustomer();
		return new ResponseEntity<List<Customer>>(allCustomer, HttpStatus.ACCEPTED);
	}
		
	
}
