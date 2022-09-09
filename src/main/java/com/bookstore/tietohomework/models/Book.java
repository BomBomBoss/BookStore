package com.bookstore.tietohomework.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;



@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "title")
    @NotEmpty(message = "please enter book title")
    @Size(min = 3, max = 50, message = "should be between 3 and 50 letters")
    private String title;

    @Column(name = "author")
    @NotEmpty(message = "please enter book author")
    @Size(min = 3, max = 50, message = "should be between 3 and 30 letters")
    private String author;

    @Column(name = "genre")
    @NotEmpty(message = "please enter book genre")
    @Size(min = 3, max = 50, message = "should be between 3 and 20 letters")
    private String genre;

    @Column(name = "created_at")
    private LocalDateTime created;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
