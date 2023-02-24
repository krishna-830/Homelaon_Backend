package com.myhomeloan.communication;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.myhomeloan.model.Enquiry_Details;
@Component
@FeignClient("re-service")
public interface EnquiryFiegn {

	@GetMapping("/Enquiries/getAllEnquiry")
	public ResponseEntity<List<Enquiry_Details>> getAllEnquiry();
}
