package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> list() {
        return service.getAll();
    }

    @PostMapping
    public void add(@RequestBody Book book) {
        service.save(book);
    }

    @GetMapping("/search")
    public List<Book> search(@RequestParam String keyword) {
        return service.search(keyword);
    }
}
