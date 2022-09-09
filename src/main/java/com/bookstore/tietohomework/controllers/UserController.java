package com.bookstore.tietohomework.controllers;

import com.bookstore.tietohomework.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    private final BookService bookService;

    @Autowired
    public UserController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping()
    public String listOfBooks(Model model){
        model.addAttribute("allBooks", bookService.showAll());
        return "listOfBooks";
    }
}
