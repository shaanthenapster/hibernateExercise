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
        String input = "06/01/1948" ;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "MM/dd/yyyy" ) ;
        LocalDate localDate = LocalDate.parse( input, formatter ) ;
        author1.setDate(localDate);
        session.save(author1);
        Author author2 = new Author();
        author2.setFirstName("Ramlal");
        author2.setLastName("Pande");
        author2.setAge(80);
        String input1 = "06/10/1958" ;
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern( "MM/dd/yyyy" ) ;
        LocalDate localDate1 = LocalDate.parse( input1, formatter ) ;
        author2.setDate(localDate1);
        session.save(author2);
        Author author3 = new Author();
        author3.setFirstName("Jhon");
        author3.setLastName("Keats");
        author3.setAge(90);
        String input3 = "06/06/1968" ;
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern( "MM/dd/yyyy" ) ;
        LocalDate localDate2 = LocalDate.parse( input3, formatter ) ;
        author3.setDate(localDate2);
        session.save(author3);
        Author author4 = new Author();
        author4.setFirstName("shubham");
        author4.setLastName("verma");
        author4.setAge(28);
        String input4 = "06/06/2006" ;
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern( "MM/dd/yyyy" ) ;
        LocalDate localDate4 = LocalDate.parse( input4, formatter ) ;
        author4.setDate(localDate);
        session.save(author4);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("task completed");
    }

}

