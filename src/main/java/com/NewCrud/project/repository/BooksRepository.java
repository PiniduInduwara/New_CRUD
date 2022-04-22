package com.NewCrud.project.repository;

import com.NewCrud.project.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer> {
}
