package com.dailycodebuffer.repository;

import com.dailycodebuffer.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface BookRepository extends JpaRepository<Book,Long> {
}
