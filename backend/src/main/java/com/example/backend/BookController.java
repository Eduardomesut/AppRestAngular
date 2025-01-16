package com.example.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @GetMapping
    public List<Book> findAll(){
        System.out.println("FindAll");
        return List.of(
                new Book(1L, "Book1"),
                new Book(2L, "Book2"),
                new Book(3L, "Book3"),
                new Book(4L, "Book4")
        );
    }
    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id){
        System.out.println("FindById");
        return new Book(id, "ejemplo");
    }
}
