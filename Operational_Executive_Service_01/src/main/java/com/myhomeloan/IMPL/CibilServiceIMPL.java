package com.myhomeloan.IMPL;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		Enquiry_Details en = enquiry.get();
		if (en!=null) {
			return false;
		}else
			
		return true;
		
	}

	

	

	
}
