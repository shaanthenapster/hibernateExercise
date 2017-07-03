package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by shaan on 1/7/17.
 */
public class PersonAplication {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Person p1 = new Person();
        p1.setPname("shaan");
        p1.setPaddress("dwarka");
        p1.setPmobile("9431022537");
        session.save(p1);
        Person p2 = new Person();
        p2.setPname("shubham");
        p2.setPaddress("lakshmi nagar");
        p2.setPmobile("2312424235");
        session.save(p2);
        Mobile mobile1 = new Mobile();
        mobile1.setMname("galaxy chat");
        mobile1.setMcompany("samsung");
        session.save(mobile1);
        Mobile mobile2 = new Mobile();
        mobile2.setMname("one plus2");
        mobile2.setMcompany("One plus");
        session.save(mobile2);
        Mobile mobile3 = new Mobile();
        mobile3.setMname("nexus");
        mobile3.setMcompany("google");
        Mobile mobile4 = new Mobile();
        session.save(mobile3);
        mobile4.setMname("oppo f1");
        mobile4.setMcompany("oppo");
        System.out.println("completed");
        session.save(mobile4);
        p1.setMobile(mobile1);
        p2.setMobile(mobile4);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
