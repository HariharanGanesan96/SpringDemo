package com.chainsys.pet.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.chainsys.pet.entity.PetDetailsEntity;
import com.chainsys.pet.model.Customers;
import com.chainsys.pet.model.PetDetails;
import com.chainsys.pet.service.CustomerService;
import com.chainsys.pet.service.PetDetailsService;



@RestController
public class Controller {
   
	@Autowired
	CustomerService customerService;
	
	@Autowired
	PetDetailsService petDetailsService;
	
	@Autowired
	Customers customers;
	
	@Autowired
	PetDetails petDetails;
	
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("usernameinput") String username,
			@RequestParam("passwordinput") String password, HttpServletRequest request, HttpServletResponse response) {
	    String firstName = customerService.loginValidation(username, password); 
	    List<PetDetailsEntity>  petList =petDetailsService.ListOfPetDetails();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("petList", petList);
		return modelAndView;
	}

}
