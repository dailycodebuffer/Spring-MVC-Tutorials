package com.dailycodebuffer.examples.SpringBootTutorial.ConfigurationProperties.properties;

import com.dailycodebuffer.examples.SpringBootTutorial.ConfigurationProperties.util.Book;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class BookConverter implements Converter<String, Book> {

    @Override
    public Book convert(String s) {
        String[] data = s.split(",");
        return  new Book(data[0], Double.parseDouble(data[1]), data[2]);
    }
}
