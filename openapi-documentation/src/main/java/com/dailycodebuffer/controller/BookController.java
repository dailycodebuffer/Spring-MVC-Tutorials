package com.dailycodebuffer.controller;

import com.dailycodebuffer.entity.Book;
import com.dailycodebuffer.exception.BookIdMismatchException;
import com.dailycodebuffer.exception.BookNotFoundException;
import com.dailycodebuffer.repository.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Operation(summary = "This is to fetch All the Books stored in Db")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Fetched All the Books form Db",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
            description = "NOt Available",
            content = @Content)
    })
    @GetMapping("book/")
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    @PostMapping("book/")
    @ResponseStatus(HttpStatus.CREATED)
    public Book create(@RequestBody Book book)
    {
        return bookRepository.save(book);
    }

    @DeleteMapping("book/{id}")
    public void delete(@PathVariable long id)
    {
        bookRepository.findById(id)
                .orElseThrow(BookNotFoundException::new);
        bookRepository.deleteById(id);
    }

    @PutMapping("book/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long id) {
        if (book.getId() != id) {
            throw new BookIdMismatchException();
        }
        bookRepository.findById(id)
                .orElseThrow(BookNotFoundException::new);
        return bookRepository.save(book);
    }


    @GetMapping("book/{id}")
    public Book find(@PathVariable Long id) {
        return bookRepository.findById(id)
                .orElseThrow(BookNotFoundException::new);
    }


}
