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
        author1.setFirstName("Shaan");
        author1.setLastName("bhattacharya");
        author1.setAge(24);
        String input = "06/01/1994" ;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "MM/dd/yyyy" ) ;
        LocalDate localDate = LocalDate.parse( input, formatter ) ;
        author1.setDate(localDate);
        author1.getAddress().setLocation("Dwarka");
        author1.getAddress().setStreenNo("1A");
        author1.getAddress().setState("Delhi");
        Subjects firstsubject = new Subjects();
        firstsubject.setSubjectName("English");
        Subjects secondsubject = new Subjects();
        secondsubject.setSubjectName("History");
        Subjects thirdsubject = new Subjects();
        thirdsubject.setSubjectName("IOT");
        author1.getListofSubjects().add(firstsubject);
        author1.getListofSubjects().add(secondsubject);
        author1.getListofSubjects().add(thirdsubject);
        session.persist(firstsubject);
        session.persist(secondsubject);
        session.persist(thirdsubject);
        session.persist(author1);



        Author author2 = new Author();
        author2.setFirstName("Hardeek");
        author2.setLastName("Pandya");
        author2.setAge(23);
        String input1 = "06/10/1995" ;
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern( "MM/dd/yyyy" ) ;
        LocalDate localDate1 = LocalDate.parse( input1, formatter1 ) ;
        author2.setDate(localDate1);
        author2.getAddress().setLocation("Shalimar Bagh");
        author2.getAddress().setStreenNo("10");
        author2.getAddress().setState("noida");
        Subjects firstsubject1 = new Subjects();
        firstsubject1.setSubjectName("OOAD");
        Subjects secondsubject1 = new Subjects();
        secondsubject1.setSubjectName("Civics");
        Subjects thirdsubject1 = new Subjects();
        thirdsubject1.setSubjectName("Economics");
        author2.getListofSubjects().add(firstsubject1);
        author2.getListofSubjects().add(secondsubject1);
        author2.getListofSubjects().add(thirdsubject1);
        session.persist(firstsubject1);
        session.persist(secondsubject1);
        session.persist(thirdsubject1);
        session.persist(author2);



        Author author3 = new Author();
        author3.setFirstName("Jhon");
        author3.setLastName("Wick");
        author3.setAge(18);
        String input3 = "06/06/2000" ;
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern( "MM/dd/yyyy" ) ;
        LocalDate localDate2 = LocalDate.parse( input3, formatter2 ) ;
        author3.setDate(localDate2);
        author3.getAddress().setLocation("wales");
        author3.getAddress().setStreenNo("1A/g8");
        author3.getAddress().setState("Canada");
        Subjects firstsubject3 = new Subjects();
        firstsubject3.setSubjectName("WEB-TECH");
        Subjects secondsubject3 = new Subjects();
        secondsubject3.setSubjectName("JAVA");
        Subjects thirdsubject3 = new Subjects();
        thirdsubject3.setSubjectName("C++");
        author3.getListofSubjects().add(firstsubject3);
        author3.getListofSubjects().add(secondsubject3);
        author3.getListofSubjects().add(thirdsubject3);
        session.persist(firstsubject3);
        session.persist(secondsubject3);
        session.persist(thirdsubject3);
        session.persist(author3);

        Author author4 = new Author();
        author4.setFirstName("shubham");
        author4.setLastName(" sharma");
        author4.setAge(28);
        String input4 = "06/06/2001" ;
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern( "MM/dd/yyyy" ) ;
        LocalDate localDate4 = LocalDate.parse( input4, formatter4 ) ;
        author4.setDate(localDate4);
        author4.getAddress().setLocation("baba dham");
        author4.getAddress().setStreenNo("25");
        author4.getAddress().setState("bholenath gali");
        Subjects firstsubject4 = new Subjects();
        firstsubject4.setSubjectName("FRENCH");
        Subjects secondsubject4 = new Subjects();
        secondsubject4.setSubjectName("GERMAN");
        Subjects thirdsubject4 = new Subjects();
        thirdsubject4.setSubjectName("POLitical");
        author4.getListofSubjects().add(firstsubject4);
        author4.getListofSubjects().add(secondsubject4);
        author4.getListofSubjects().add(thirdsubject4);
        session.persist(firstsubject4);
        session.persist(secondsubject4);
        session.persist(thirdsubject4);
        session.persist(author4);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("task completed");
    }

}

