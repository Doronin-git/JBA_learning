package com.example.JBA_learning;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.math.BigDecimal;

@Entity

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    public String author;


    public Long price;

    @Column(unique = true,nullable = false)
    public String isbn;
    public Book() {}

    public void setPrice(Long price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    public Long getId(){
        return id;
    }

    public String getIsbn() {
        return isbn;
    }
}
