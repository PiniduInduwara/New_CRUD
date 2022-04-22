package com.NewCrud.project.repository;

import com.NewCrud.project.model.Books;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends MongoRepository<Books, Integer>{


}
