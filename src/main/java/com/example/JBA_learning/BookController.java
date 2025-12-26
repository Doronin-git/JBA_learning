package com.example.JBA_learning;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bk){
        bookService = bk;
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @GetMapping("/book")
    public List<Book> showAllBooks(){
        return bookService.findAll();
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable Long id){
        return bookService.findById(id);
    }



}
