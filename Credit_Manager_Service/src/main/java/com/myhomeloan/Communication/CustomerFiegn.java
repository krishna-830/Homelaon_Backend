package com.myhomeloan.Communication;




import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.myhomeloan.Model.Customer;



@FeignClient("oe-service")
@Component
public interface CustomerFiegn {
	//get All Customer
	

	@GetMapping("/Ope-Api/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer();
}
