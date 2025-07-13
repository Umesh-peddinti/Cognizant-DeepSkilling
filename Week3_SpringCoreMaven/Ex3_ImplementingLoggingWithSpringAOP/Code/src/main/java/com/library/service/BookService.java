package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("BookService: Starting to process book addition...");
        bookRepository.saveBook();
        System.out.println("BookService: Book addition completed.");
    }
}
