package com.myhomeloan.proxyService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.myhomeloan.model.Cibil;

@FeignClient("oe-service")
@Component
public interface OEproxyService {
	@GetMapping("/Ope_Api/getAllCibilStatus")
	 public ResponseEntity<List<Cibil>> getAllCibilStatus();
}
