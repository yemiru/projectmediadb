package com.java.cmsc495.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.cmsc495.model.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer> {

}
