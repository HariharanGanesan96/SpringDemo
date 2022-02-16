package com.chainsys.pet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chainsys.pet.entity.CustomersEntity;

public interface CustomerRepository extends JpaRepository<CustomersEntity, Integer>{
	
}
