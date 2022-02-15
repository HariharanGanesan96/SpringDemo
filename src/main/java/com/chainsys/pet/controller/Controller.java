package com.chainsys.pet.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.chainsys.pet.dao.CustomerRepository;
import com.chainsys.pet.model.Customers;
import com.chainsys.pet.model.PetDetails;
import com.chainsys.pet.service.CustomerService;

@RestController
public class Controller {
   
	@Autowired
	CustomerService customerService;
	
	@Autowired
	Customers customers;
	
	@Autowired
	PetDetails petDetails;
	
	 @Autowired
	CustomerRepository customerRepository;
	
		
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("usernameinput") String username,
			@RequestParam("passwordinput") String password, HttpServletRequest request, HttpServletResponse response) {

	    String firstName=customerService.loginValidation(username, password);
	    	    
	   //customerService.ListOfCustomers();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("name", firstName);
		return modelAndView;
	}

}
