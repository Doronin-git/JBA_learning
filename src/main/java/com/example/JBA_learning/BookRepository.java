package com.example.JBA_learning;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List; // или от хайбернейт?
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {
        public List<Book> findByAuthor(Long id);
        public Optional<Book> findByIsbn(String isbn); // чо за опшнал
        boolean existsByIsbn(String isbn);
}
