package com.myhomeloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RelationalExecutiveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationalExecutiveServiceApplication.class, args);

	}

}
