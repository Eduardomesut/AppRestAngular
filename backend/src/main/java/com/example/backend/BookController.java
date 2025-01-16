package com.example.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @GetMapping
    public List<Book> findAll() {
        System.out.println("FindAll");
        return List.of(
                new Book(1L, "Book1"),
                new Book(2L, "Book2"),
                new Book(3L, "Book3"),
                new Book(4L, "Book4")
        );
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id) {
        System.out.println("FindById");
        return new Book(id, "ejemplo");
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        System.out.println("CreateBook");
        return new Book(book.id(), book.tittle());
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        System.out.println("UpdateBook");
        return new Book(id, book.tittle());
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        System.out.println("DeleteBook");
    }
}
