package com.myhomeloan;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.myhomeloan.proxyService")
public class RelationalExecutiveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationalExecutiveServiceApplication.class, args);

	}
	
      @Bean
	 public ModelMapper getMapper() {
		
		 return new ModelMapper();
	}
}
