package com.myhomeloan.proxyService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


import com.myhomeloan.model.SanctionLetter;



public interface CMproxy {
	@GetMapping("/credit-api/getAllSanctionLetter")
	public ResponseEntity<SanctionLetter> getSanctionLetter();
}
