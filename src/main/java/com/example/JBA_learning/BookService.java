package com.example.JBA_learning;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book CreateBook(Book book){
        if (bookRepository.existsByIsbn(book.getIsbn())) {
            throw new IllegalStateException("Book exists");
        }
        return bookRepository.save(book); //бля а что именно мы возвращаем? мы же вроде сохранили
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Book findById(Long id){
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found"));
    }
}
