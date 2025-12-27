package com.example.JBA_learning;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;

    // getters

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Book> getBooks() {
        return books;
    }

    // setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

