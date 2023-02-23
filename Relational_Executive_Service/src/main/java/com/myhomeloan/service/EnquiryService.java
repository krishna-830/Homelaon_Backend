package com.myhomeloan.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.myhomeloan.model.Enquiry_Details;

public interface EnquiryService {

	Enquiry_Details SaveEnquiry(Enquiry_Details enquiry_details);

	Enquiry_Details getEnquiry(int eid);

	List<Enquiry_Details> getAllEnquiry();

	void deleteEnquiry(int eid);



	

}
