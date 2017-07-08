package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by shaan on 3/7/17.
 */

public class CreateAuthor {
    public static void main(String[] args) {
        CreateAuthor createAuthor = new CreateAuthor();
        //createAuthor.saveAuthor("Ruskin","Bond",80);
       /* createAuthor.saveAuthor("RabindraNath","Tagore",90);
        createAuthor.saveAuthor("Munshi","Premchand",75);
        createAuthor.saveAuthor("William","Shakespear",80);
        *//*createAuthor.retriveAuthor();*/
        /*createAuthor.deleteAuthor();
        createAuthor.updateAuthor();
            */

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author author1 = new Author();
        author1.setFirstName("Saif");
        author1.setLastName("Aehmad");
        author1.setAge(45);
        session.save(author1);
        Author author2 = new Author();
        author2.setFirstName("Ramlal");
        author2.setLastName("Pandey");
        author2.setAge(80);
        session.save(author2);
        Author author3 = new Author();
        author3.setFirstName("Jhon");
        author3.setLastName("Keats");
        author3.setAge(90);
        session.save(author3);
        Author author4 = new Author();
        author4.setFirstName("shubham");
        author4.setLastName("verma");
        author4.setAge(28);
        session.save(author4);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("task completed");
    }

}

