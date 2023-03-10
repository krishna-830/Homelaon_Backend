package com.myhomeloan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhomeloan.Repository.EnquiryRepository;
import com.myhomeloan.model.Enquiry_Details;
import com.myhomeloan.service.EnquiryService;

@Service
public class EnquiryServiceIMPL implements EnquiryService{
	
	@Autowired
	private EnquiryRepository repo;

	@Override
	public Enquiry_Details SaveEnquiry(Enquiry_Details enquiry_details) {
		// TODO Auto-generated method stub
		return repo.save(enquiry_details);
	}

	@Override
	public Enquiry_Details getEnquiry(int eid) {
		// TODO Auto-generated method stub
		return repo.findById(eid).get();
	}

	@Override
	public List<Enquiry_Details> getAllEnquiry() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteEnquiry(int eid) {
		repo.deleteById(eid);
	  
	}
	
	
	

	

}
