package com.dailycodebuffer.examples.SpringBootTutorial.repository;

import com.dailycodebuffer.examples.SpringBootTutorial.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
