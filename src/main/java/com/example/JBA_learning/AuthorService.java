package com.example.JBA_learning;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    public final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {this.authorRepository = authorRepository;}

    public Author createAuthor(Author a){
        if (a.getId() == null){
            return authorRepository.save(a);
        }
        else {
            throw new RuntimeException("already exists");
        }
    }

    public Author getAuthor(Long id){
        return authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));
    }
}
