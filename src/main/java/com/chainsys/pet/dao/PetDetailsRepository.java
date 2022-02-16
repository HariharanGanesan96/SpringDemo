package com.chainsys.pet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chainsys.pet.entity.PetDetailsEntity;

public interface PetDetailsRepository extends JpaRepository<PetDetailsEntity, Integer>{
	
}
