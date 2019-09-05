package com.dailycodebuffer.examples.SpringBootTutorial.controller;

import com.dailycodebuffer.examples.SpringBootTutorial.entity.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private List<Book> bookList = new ArrayList<>();

    {
        bookList.add(new Book(10001l,"Book1", "Author1"));
        bookList.add(new Book(10002l,"Book2", "Author2"));
        bookList.add(new Book(10003l,"Book3", "Author3"));
        bookList.add(new Book(10004l,"Book4", "Author4"));
    }

    @RequestMapping("/book/all")
    public List<Book> findAll() {
        return bookList;
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public Book addEntity(Book book) {
        bookList.add(book);
        return book;
    }

    @RequestMapping("/book/findby/{id}")
    public Book findById(@PathVariable Long id) {
        return bookList.stream().
                filter(book -> book.getId().equals(id)).
                findFirst().get();
    }
}
