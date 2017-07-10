package com.hibernate;

import javax.persistence.*;

/**
 * Created by shaan on 8/7/17.
 */
@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int book_id;
    String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

   /* @ManyToOne*/
   /* Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
*/

}
