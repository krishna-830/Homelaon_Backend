package com.myhomeloan.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.myhomeloan.model.SanctionLetter;

public interface SanctionLetterService {

	String saveSanctionLetter();

	List<SanctionLetter> getAllSanctionLetter();
    

}
