
package com.OnetoMany;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class DriverClass {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Bachelor b1 = new Bachelor();
        b1.setName("harddek");
        b1.setCity("delhi");
        b1.setCompany("nagarro");
        b1.setMobileNo("9999408860");
        session.save(b1);
        Bachelor b2 = new Bachelor();
        b2.setName("shaan");
        b2.setCity("delhi");
        b2.setCompany("tothenew");
        b2.setMobileNo("9718460374");
        session.save(b2);
        Bachelor b3 = new Bachelor();
        b3.setName("shubham");
        b3.setCity("noida");
        b3.setCompany("indus valley partners");
        b3.setMobileNo("99994226530");
        session.save(b3);
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicle_Name("aviator");
        vehicle1.setVehicle_Type("scooty");
        session.save(vehicle1);
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicle_Name("alto");
        vehicle2.setVehicle_Type("car");
        session.save(vehicle2);
        Vehicle vehicle3 = new Vehicle();
        vehicle3.setVehicle_Name(" scorpio");
        vehicle3.setVehicle_Type("suv");
        session.save(vehicle3);
        Vehicle vehicle4 = new Vehicle();
        vehicle4.setVehicle_Name("harley davidson");
        vehicle4.setVehicle_Type("bike");
        session.save(vehicle4);
        Vehicle vehicle5 = new Vehicle();
        vehicle5.setVehicle_Name(" bullet");
        vehicle5.setVehicle_Type(" bike");
        session.save(vehicle5);
        // mampping of the one to many relation
        b2.getVehicle().add(vehicle2);
        b2.getVehicle().add(vehicle1);
        b3.getVehicle().add(vehicle5);
        b3.getVehicle().add(vehicle3);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("task completed");

    }
}
