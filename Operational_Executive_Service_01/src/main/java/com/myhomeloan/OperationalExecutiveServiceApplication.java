package com.myhomeloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
  @EnableFeignClients("com.myhomeloan.communication")
  @EnableEurekaClient
public class OperationalExecutiveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperationalExecutiveServiceApplication.class, args);
		
	}

}
