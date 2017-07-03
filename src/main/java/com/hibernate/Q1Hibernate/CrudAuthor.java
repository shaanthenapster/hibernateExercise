/*
package com.hibernate.Q1Hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


*/
/**
 * Created by shaan on 3/7/17.
 *//*

public class CrudAuthor {
    public static void main(String[] args) {
        CrudAuthor crudAuthor = new CrudAuthor();
        crudAuthor.saveAuthor("Ruskin","Bond",80);
        crudAuthor.saveAuthor("RabindraNath","Tagore",90);
        crudAuthor.saveAuthor("Munshi","Premchand",75);
        crudAuthor.saveAuthor("William","Shakespear",80);
        */
/*crudAuthor.retriveAuthor();
        crudAuthor.deleteAuthor();
        crudAuthor.updateAuthor();
            *//*

    }
    public void saveAuthor(String fname,String lname,int age)
    {

        try {
            SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Author author = new Author();
            author.setFirstName(fname);
            author.setLastName(lname);
            author.setAge(1);
            session.save(author);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
            System.out.println("task completed");
        }catch (HibernateException ex)
        {
          ex.printStackTrace();
        }

    }
}
*/
