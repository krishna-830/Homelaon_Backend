package com.myhomeloan.proxyService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient("oe-service")
@Component
public interface OEproxyService {

}
