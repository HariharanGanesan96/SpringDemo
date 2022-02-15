package com.chainsys.pet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.pet.model.PetDetails;

@Repository
public interface PetDetailsRepository extends CrudRepository<PetDetails, Integer>{

}
