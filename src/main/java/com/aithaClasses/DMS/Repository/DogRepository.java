package com.aithaClasses.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aithaClasses.DMS.Models.Dog;

/*
 * @author Vasanth Sai Aitha
 */
public interface DogRepository extends CrudRepository<Dog,  Integer> {
	List<Dog> findByName(String name);

}
