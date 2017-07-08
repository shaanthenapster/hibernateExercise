package com.hibernate;

import javax.persistence.Entity;

/**
 * Created by shaan on 8/7/17.
 */

public class Address {
    String streenNo;
    String location;
    String street;
    public String getStreenNo() {
        return streenNo;
    }

    public void setStreenNo(String streenNo) {
        this.streenNo = streenNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
