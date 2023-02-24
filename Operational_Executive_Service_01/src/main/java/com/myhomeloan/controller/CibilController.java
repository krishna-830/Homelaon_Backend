package com.myhomeloan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myhomeloan.model.Cibil;
import com.myhomeloan.model.Enquiry_Details;
import com.myhomeloan.service.CibilService;


@RestController
@RequestMapping("/Ope_Api")
public class CibilController {
    
	
	@Autowired
	private CibilService service;
	
	public void setCibilStatus() {
		
		
		Enquiry_Details endet = new Enquiry_Details(1,"Krishna","12",26,"male","krishnawadle",784989,3457984,5894759);
		List<Enquiry_Details> enqlist=new ArrayList<Enquiry_Details>();
		 enqlist.add(endet);
		
		 for(Enquiry_Details en:enqlist) {
			 
			 if(checkMyEnquiryByid(en.getEID())) {
				 
					Enquiry_Details enquiry= saveEnquiry(en);
					Cibil c = new Cibil();
					c.setCibilId(1);
					c.setCibilScore(678);
					c.setStatus("Okay");
					c.setRemarks("Good");
					c.setEID(en.getEID());
					Cibil cibil=saveCibil(c);
				 
			 }else {
				
			}	
		 }	
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


}
