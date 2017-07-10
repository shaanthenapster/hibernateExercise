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
         Books books = new Books();
          books.setBookName("The qWerty");
        author1.getListBook().add(books);
        session.save(author1);
        session.save(books);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("task completed");
    }

}

