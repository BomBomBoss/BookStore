package com.bookstore.tietohomework.controllers;

import com.bookstore.tietohomework.models.Book;
import com.bookstore.tietohomework.services.BookService;
import com.bookstore.tietohomework.util.BookValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AdminController {

    private final BookService bookService;
    private final BookValidator bookValidator;

    @Autowired
    public AdminController(BookService bookService, BookValidator bookValidator) {
        this.bookService = bookService;
        this.bookValidator = bookValidator;
    }


    @GetMapping("/newBook")
    public String addBookForm(@ModelAttribute ("book") Book book){
        return "addBook";
    }

    @PostMapping("/newBook")
    public String newBook(@ModelAttribute("book") @Valid Book book,
                          BindingResult bindingResult) {
        bookValidator.validate(book,bindingResult);
        if (bindingResult.hasErrors())
            return "addBook";
        bookService.saveBook(book);
        return "redirect:/";
    }
}
