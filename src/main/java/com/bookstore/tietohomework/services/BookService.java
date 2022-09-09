package com.bookstore.tietohomework.services;

import com.bookstore.tietohomework.models.Book;
import com.bookstore.tietohomework.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;


    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> showAll () {
        return bookRepository.findAllByOrderByCreatedDesc();
    }

    public void saveBook (Book book) {
        enrichBook(book);
        bookRepository.save(book);
    }

    public void enrichBook(Book book) {
        book.setCreated(LocalDateTime.now());
    }

    public Book findByTitle(String title) {
        Optional<Book> book = bookRepository.findByTitle(title);
        return book.orElse(null);
    }
}
