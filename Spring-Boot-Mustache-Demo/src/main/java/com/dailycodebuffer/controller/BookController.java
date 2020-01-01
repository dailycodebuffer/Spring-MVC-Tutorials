package com.dailycodebuffer.controller;

import com.dailycodebuffer.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getProducts(final Model model){

        List bookList = IntStream.range(0,7)
                        .mapToObj(this::getBook)
                        .collect(Collectors.toList());

        model.addAttribute("bookList",bookList);
        return "book";
    }

    private Book getBook(int i){
        return new Book((long) i,
                "ISBN Number -" + i,
                "Book Name " + i,
                "Author " + i,
                (double) (100 * i));
    }
}
