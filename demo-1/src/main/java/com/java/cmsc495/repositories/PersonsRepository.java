package com.java.cmsc495.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.cmsc495.model.Persons;


@Repository
public interface PersonsRepository extends CrudRepository<Persons, Integer>{

}
