package com.myhomeloan.proxyService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.myhomeloan.model.Cibil;

@FeignClient(name = "oe-service",url = "http://localhost:8004/Ope-Api")
public interface OEproxyService {
	
	
	@GetMapping("/getAllCibilStatuses")
	 public List<Cibil> getAllCibilStatuses();
}
