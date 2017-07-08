package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by shaan on 5/7/17.
 */
public class UpdateAuthor {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author author = (Author) session.get(Author.class, 1);
        author.setFirstName("shaan");
        author.setLastName("bhattacharya");
        author.setAge(24);
        session.update(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("task completed : Author Updated");

    }
}
