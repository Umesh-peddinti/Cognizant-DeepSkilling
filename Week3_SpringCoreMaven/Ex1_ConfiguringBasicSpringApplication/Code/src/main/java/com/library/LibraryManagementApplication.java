package com.library;

import com.library.service.BookService;
import com.library.repository.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookRepository bookRepo = (BookRepository) context.getBean("bookRepository");
        BookService bookService = (BookService) context.getBean("bookService");

        bookRepo.saveBook();
        bookService.addBook();
    }
}
