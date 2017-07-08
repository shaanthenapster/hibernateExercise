package com.hibernate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by shaan on 3/7/17.
 */
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="a_id")
    int authorid;
     @Column(name = "f_name")
    String firstName;
    @Column(name = "Surname")
    String lastName;
    @Column(name = "Age")
    int age;
    @Override
    public String toString() {
        return "Author{" +
                "authorid=" + authorid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

