package com.NewCrud.project.repository;

import com.NewCrud.project.model.Books;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BooksRepository extends MongoRepository<Books, Integer>{

}
