package com.example.practice1.classesAndObjects;

public class Book {
    String bookName;
    String author;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }
}
