package com.chainsys.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.chainsys.pet.dao.CustomerRepository;
import com.chainsys.pet.daoimpl.CustomerDAO;
import com.chainsys.pet.model.Customers;

@Service
@ComponentScan("com")
public class CustomerService {
	
	@Autowired
	Customers customers;
	
	@Autowired
	CustomerDAO customerDAO;
	
   
  
	public String loginValidation(String username,String password) {
		customers.setUserName(username);
		customers.setPassword(password);		
		return customerDAO.customerLoginValidation(customers);
	}
	
	public Customers customerDetails(String username) {		
		return customers=customerDAO.customerDetails(username);		
	}
	
	public List<Customers> ListOfCustomers(){
		//  List<Customers> customerList=  (List<Customers>) customerRepository.findAll();		    
		//  System.out.println("list " +customerList);
		return null;
		
	}
	
}
