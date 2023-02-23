package com.myhomeloanapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhomelaonapp.repository.HomeLoanDao;
import com.myhomeloanapp.model.Cibil;

@Service
public class HomeLoanServiceIPML implements HomeLoanService{
    
	@Autowired
	private HomeLoanDao repo;
	
	@Override
	public Cibil saveCibilScore(Cibil cibil) {
		return  repo.save(cibil);
	}

}
