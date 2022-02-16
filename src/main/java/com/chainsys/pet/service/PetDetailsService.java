package com.chainsys.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.chainsys.pet.dao.CustomerRepository;
import com.chainsys.pet.dao.PetDetailsRepository;
import com.chainsys.pet.daoimpl.CustomerDAO;
import com.chainsys.pet.entity.CustomersEntity;
import com.chainsys.pet.entity.PetDetailsEntity;
import com.chainsys.pet.model.Customers;
import com.chainsys.pet.model.PetDetails;

@Service
public class PetDetailsService {
	
	@Autowired
	PetDetails petDetails;
	
	
	@Autowired
	PetDetailsRepository petDetailsRepository;
   
  
	public List<PetDetailsEntity> ListOfPetDetails(){
		 List<PetDetailsEntity> petList=  (List<PetDetailsEntity>) petDetailsRepository.findAll();		    
		 System.out.println("list " +petList);
		return petList;	
	}
	
}
