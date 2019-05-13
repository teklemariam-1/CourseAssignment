package edu.mum.cs.cs425.demowebapps.elibrary.service;

import edu.mum.cs.cs425.demowebapps.elibrary.model.Book;
import edu.mum.cs.cs425.demowebapps.elibrary.repository.BookRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Iterable<Book> getBooks() {
        return bookRepository.findAll();
    }

    
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	
	public Book findOne(Long id) {
		return bookRepository.getOne(id);
	}

	
	public void delete(Long id) {
		bookRepository.deleteById(id);
	}
}
