package com.chainsys.pet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chainsys.pet.entity.AdminEntity;

public interface AdminDetailsRepository extends JpaRepository<AdminEntity, Integer>{
	
}
