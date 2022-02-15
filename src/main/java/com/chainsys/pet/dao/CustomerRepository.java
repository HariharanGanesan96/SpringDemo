package com.chainsys.pet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chainsys.pet.model.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{
	
}
