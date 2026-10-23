package com.example.library.controller;

import java.util.List;
import com.example.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import com.example.library.repository.BookRepository;

@RestController 
@RequestMapping ("/api/books")
public class BookController {
    
    @Autowired 
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping ("/{id}")
    public Book getBookById(@PathVariable long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @PostMapping 
    public Book createBook(@RequestBody @NonNull Book book) {
        return bookRepository.save(book);
    }

    @DeleteMapping ("/{id}")
    public void deleteBook(@PathVariable long id) {
        bookRepository.deleteById(id);
    }

    // 5. PUT (Update) an existing book
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable long id, @RequestBody Book updatedBook) {
        return bookRepository.findById(id)
            .map(book -> {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                book.setPublicationYear(updatedBook.getPublicationYear());
                return bookRepository.save(book);
            })
            .orElseGet(() -> {
                updatedBook.setId(id);
                return bookRepository.save(updatedBook);
            });
    }
}

