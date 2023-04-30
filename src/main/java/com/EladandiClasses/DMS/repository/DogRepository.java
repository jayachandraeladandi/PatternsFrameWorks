package com.EladandiClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.EladandiClasses.DMS.Models.Dog;

/**
 * 
 * @author S554969
 *
 */

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog>findByName(String name);

}
