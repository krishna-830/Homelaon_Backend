package com.myhomeloan.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.myhomeloan.Repository.SanctionLettrerRepository;
import com.myhomeloan.model.SanctionLetter;
import com.myhomeloan.proxyService.CMproxy;
import com.myhomeloan.service.SanctionLetterService;

@Service
public class SanctionLetterServiceIMPL implements SanctionLetterService{
	@Autowired
	private SanctionLettrerRepository sanctionLetterRepo;
    @Autowired
    private CMproxy cmproxy;
    @Autowired
    private SanctionLettrerRepository sancrepo;
	@Override
	public String saveSanctionLetter() {
		ResponseEntity<SanctionLetter> entity = cmproxy.getSanctionLetter();
		SanctionLetter sanctionLetter = entity.getBody();
		if(chechSnctionLetter(sanctionLetter.getSid())) {
			SanctionLetter savedSanction = sancrepo.save(sanctionLetter);
			return "ok";
		}
		return "Not saved";
	}
	
	
	
	
	private boolean chechSnctionLetter(int sid) {
		if(sancrepo.findById(sid).isPresent()) {
			return false;
		}
		return true;
	}

	


}
