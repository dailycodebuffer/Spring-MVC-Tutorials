package com.dailycodebuffer.model;

public class Book {
    private long bookid;
    private String isbn;
    private String bookTitle;
    private String author;
    private Double price;

    public long getBookid() {
        return bookid;
    }

    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", isbn='" + isbn + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(long bookid, String isbn, String bookTitle, String author, Double price) {
        this.bookid = bookid;
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    public Book() {

    }
}
