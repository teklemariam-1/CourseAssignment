package edu.mum.cs.cs425.demowebapps.elibrary.repository;

import edu.mum.cs.cs425.demowebapps.elibrary.model.Book;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bookRepository")
public interface BookRepository extends JpaRepository<Book, Long> {
}
