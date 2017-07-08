package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by shaan on 8/7/17.
 */
@Entity
public class Book {
    @Id
    int bookId;
    String bookName;
}
