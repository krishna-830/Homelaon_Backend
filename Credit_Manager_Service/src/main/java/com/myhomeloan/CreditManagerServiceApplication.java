package com.myhomeloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories("com.myhomeloan.Dao")
public class CreditManagerServiceApplication {

	public static void main(String[] args) {
	SpringApplication.run(CreditManagerServiceApplication.class, args);
	System.out.println("Credit Manager Works..!");
	}

}
