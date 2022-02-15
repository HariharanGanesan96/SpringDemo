package com.chainsys.pet.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com"})
public class PetApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetApplication.class, args);
		System.out.println("welcome");
	}

}
