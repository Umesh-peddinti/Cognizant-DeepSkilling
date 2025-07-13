package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String serviceId;

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor Injection: BookRepository injected.");
    }

    // Setter Injection
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
        System.out.println("Setter Injection: serviceId set to " + serviceId);
    }

    public void addBook() {
        System.out.println("BookService: Adding a book...");
        bookRepository.saveBook();
        System.out.println("Service ID: " + serviceId);
    }
}