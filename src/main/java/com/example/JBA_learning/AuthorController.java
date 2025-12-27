package com.example.JBA_learning;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {
    public AuthorService authorService;

    public AuthorController(AuthorService authorService){this.authorService = authorService;}

    @PostMapping
    public Author postAuthor(@RequestBody Author author){
        return authorService.createAuthor(author);
    }

    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return authorService.getAuthor(id);
    }
}
