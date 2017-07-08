package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by shaan on 5/7/17.
 */
public class ReadAuthor {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // Reading from the existing author table(hbm2ddl = update)
        Author author = (Author) session.get(Author.class, 1);
        System.out.println("Author pulled up is" + author.getFirstName() + " " + author.getLastName()+" "+author.getAge());
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("task completed");

    }
}
