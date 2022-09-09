package com.bookstore.tietohomework.repository;

import com.bookstore.tietohomework.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findAllByOrderByCreatedDesc();

    Optional<Book> findByTitle(String title);
}
