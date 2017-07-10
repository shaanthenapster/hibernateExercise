package com.hibernate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by shaan on 8/7/17.
 */
@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int book_id;
    String bookName;
    @ManyToMany
    Set<Author> author = new HashSet<>();

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


}
