package com.chainsys.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.chainsys.pet.dao.CustomerRepository;
import com.chainsys.pet.daoimpl.CustomerDAO;
import com.chainsys.pet.entity.CustomersEntity;
import com.chainsys.pet.model.Customers;

@Service
@ComponentScan("com")
public class CustomerService {
	
	@Autowired
	Customers customers;
	
	@Autowired
	CustomerDAO customerDAO;
	
	@Autowired
	CustomerRepository customerRepository;
   
  
	public String loginValidation(String username,String password) {
		customers.setUserName(username);
		customers.setPassword(password);		
		return customerDAO.customerLoginValidation(customers);
	}
	
	public Customers customerDetails(String username) {		
		return customers=customerDAO.customerDetails(username);		
	}
	
	public List<Customers> ListOfCustomers(){
		 List<CustomersEntity> customerList=  (List<CustomersEntity>) customerRepository.findAll();		    
		 System.out.println("list " +customerList);
		return null;
		
	}
	
}
