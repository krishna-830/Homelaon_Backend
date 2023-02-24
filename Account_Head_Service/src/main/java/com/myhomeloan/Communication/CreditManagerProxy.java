package com.myhomeloan.Communication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient("")
@Component
public interface CreditManagerProxy {

	
}
