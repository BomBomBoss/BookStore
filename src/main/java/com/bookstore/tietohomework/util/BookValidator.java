package com.bookstore.tietohomework.util;

import com.bookstore.tietohomework.models.Book;
import com.bookstore.tietohomework.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BookValidator implements Validator {

    private final BookService bookService;

    @Autowired
    public BookValidator(BookService bookService) {
        this.bookService = bookService;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return Book.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Book book = (Book) target;


        if(bookService.findByTitle(book.getTitle())!=null){
            errors.rejectValue("title","","This book already exists");
        }


    }
}
