package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * Created by shaan on 3/7/17.
 */

public class CreateAuthor {
    public static void main(String[] args) {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author author1 = new Author();
        author1.setFirstName("shaan");
        author1.setLastName("bhattacharya");
        author1.setAge(24);
        Author author2 = new Author();
        author2.setFirstName("shubhma");
        author2.setLastName("verma");
        author2.setAge(25);
        Books books1 = new Books();
        books1.setBookName("The qWerty");
        Books books2 = new Books();
        books2.setBookName("The Broken");
        author1.getListBook().add(books1);
        author1.getListBook().add(books2);
        books1.getAuthor().add(author1);
        books2.getAuthor().add(author1);
        author2.getListBook().add(books2);
        author2.getListBook().add(books1);
        books1.getAuthor().add(author2);
        books2.getAuthor().add(author1);
        session.save(author1);
        session.save(author2);
        session.save(books1);
        session.save(books2);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("task completed");
    }

}

