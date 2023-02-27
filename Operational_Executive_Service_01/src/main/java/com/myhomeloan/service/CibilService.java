package com.myhomeloan.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.myhomeloan.model.Cibil;
import com.myhomeloan.model.Customer;
import com.myhomeloan.model.Enquiry_Details;

public interface CibilService {

	Cibil checkCibilScore(Cibil cibil);

	Cibil GetCibilStatus(int cibilId);

	Enquiry_Details saveEnquiry(Enquiry_Details en);

	Cibil saveCibil(Cibil c);

	boolean checkMyEnquiryByid(int eid);

	ResponseEntity<List<Enquiry_Details>> getAllEnquiry();

	List<Cibil> getAllCibilStatus();

   List<Customer> getAllCustomer();

List<Cibil> getAllCibilStatuses();

	

}
