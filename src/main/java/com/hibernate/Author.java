package com.hibernate;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by shaan on 3/7/17.
 */
@Entity
@Table(name = "Authors")
public class Author {
    @Id
    @Column(name="Author_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int authorid;
     @Column(name = "Full_name")
    String firstName;
    @Column(name = "Surname")
    String lastName;
    @Column(name = "Age")
    int age;
    @ManyToMany
   Set<Books> listBook = new HashSet<Books>();

    public Set<Books> getListBook() {
        return listBook;
    }

    public void setListBook(Set<Books> listofSubjects) {
        this.listBook = listofSubjects;
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
   /* public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
*/
}

