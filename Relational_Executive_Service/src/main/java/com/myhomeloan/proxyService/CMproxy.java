package com.myhomeloan.proxyService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


import com.myhomeloan.model.SanctionLetter;



public interface CMproxy {
	@GetMapping("credit-api/getAllSanctionLetter")
	public ResponseEntity<List<SanctionLetter>> getSanctionLetter();
}
