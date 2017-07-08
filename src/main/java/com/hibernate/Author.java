package com.hibernate;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by shaan on 3/7/17.
 */
@Entity
@Table(name = "Authors")
public class Author {
    @Id
    @Column(name="Author_id")
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int authorid;
     @Column(name = "Full_name")
    String firstName;
    @Column(name = "Surname")
    String lastName;
    @Column(name = "Age")
    int age;
    @Column(name = "Date_of_Birth")
    LocalDate date;
    @Embedded
    Address address =  new Address();

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

