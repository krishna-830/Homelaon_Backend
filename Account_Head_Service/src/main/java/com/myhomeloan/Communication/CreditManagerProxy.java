package com.myhomeloan.Communication;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.myhomeloan.model.SanctionLetter;

@FeignClient("cm-service")
@Component
public interface CreditManagerProxy {
	
	
	@GetMapping("/credit-api/getAllSanctionLetter")
	public ResponseEntity<List<SanctionLetter>> getSanctionLetter();
	
	
	

	
}
