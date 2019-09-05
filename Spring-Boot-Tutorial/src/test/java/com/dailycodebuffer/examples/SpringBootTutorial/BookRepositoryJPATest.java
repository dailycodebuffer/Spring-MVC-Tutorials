package com.dailycodebuffer.examples.SpringBootTutorial;

import com.dailycodebuffer.examples.SpringBootTutorial.entity.Book;
import com.dailycodebuffer.examples.SpringBootTutorial.repository.BookRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootTutorialApplication.class)
public class BookRepositoryJPATest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void givenBookRepository_whenSaveAndRetreiveBook_thenOK() {
        Book book =  bookRepository.save(new Book(1005l,"Book5","Author5"));
        Book findBook = bookRepository.findById(book.getId()).get();

        Assert.assertNotNull(findBook);
        Assert.assertEquals(book.getAuthor(),findBook.getAuthor());
    }
}
