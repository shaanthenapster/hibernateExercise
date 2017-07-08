package com.hibernate;

import javax.persistence.*;

/**
 * Created by shaan on 8/7/17.
 */
@Entity
public class Book {
    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer bookId;
    String bookName;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @OneToOne
    Author author;
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
