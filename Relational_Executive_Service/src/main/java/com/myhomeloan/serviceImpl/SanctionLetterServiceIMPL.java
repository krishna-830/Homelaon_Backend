package com.myhomeloan.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhomeloan.Repository.SanctionLettrerRepository;
import com.myhomeloan.model.SanctionLetter;
import com.myhomeloan.service.SanctionLetterService;

@Service
public class SanctionLetterServiceIMPL implements SanctionLetterService{
	@Autowired
	private SanctionLettrerRepository sanctionLetterRepo;



}
