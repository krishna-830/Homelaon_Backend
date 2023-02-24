package com.myhomeloan.IMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.myhomeloan.communication.EnquiryFiegn;
import com.myhomeloan.model.Cibil;
import com.myhomeloan.model.Enquiry_Details;
import com.myhomeloan.repository.CibilRepository;
import com.myhomeloan.repository.EnquiryRepo;
import com.myhomeloan.service.CibilService;


@Service
public class CibilServiceIMPL implements CibilService {

	@Autowired
	private CibilRepository crepo;
	
	@Autowired
	private EnquiryRepo enrepo;
	
	@Autowired
	private EnquiryFiegn enqproxy;
	
	@Override
	public Cibil checkCibilScore(Cibil cibil) {

		return crepo.save(cibil);
		
	}

	@Override
	public Cibil GetCibilStatus(int cibilId) {
		
		return crepo.findById(cibilId).get();
	}

	@Override
	public Enquiry_Details saveEnquiry(Enquiry_Details en) {
		
		return enrepo.save(en);
	}

	@Override
	public Cibil saveCibil(Cibil c) {
		
		
		return crepo.save(c);
	}

	@Override
	public boolean checkMyEnquiryByid(int eid) {
		
		Optional<Enquiry_Details> enquiry = enrepo.findById(eid);
		
		if (enquiry.isPresent()) {
			return false;
		}else
			
		return true;
		
	}

	@Override
	public ResponseEntity<List<Enquiry_Details>> getAllEnquiry() {
		
		return enqproxy.getAllEnquiry();
	}

	

	

	
}
