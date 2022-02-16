package com.chainsys.pet.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com")
@EnableJpaRepositories(basePackages = "com")
@EntityScan(basePackages = "com")
public class PetApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetApplication.class, args);
		System.out.println("welcome");	
	}

}
