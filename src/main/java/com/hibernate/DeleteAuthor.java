package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by shaan on 5/7/17.
 */
public class DeleteAuthor {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author author = session.get(Author.class, 2);
        session.delete(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("task completed");
    }
}
