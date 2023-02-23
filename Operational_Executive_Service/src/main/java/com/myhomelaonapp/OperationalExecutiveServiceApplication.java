package com.myhomelaonapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.myhomelaonapp.repository" })
public class OperationalExecutiveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperationalExecutiveServiceApplication.class, args);
		
		System.out.println(" Operational Executive Department!!!");
	}

}
