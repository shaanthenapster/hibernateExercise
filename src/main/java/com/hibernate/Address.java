package com.hibernate;

import javax.persistence.Entity;

/**
 * Created by shaan on 8/7/17.
 */

public class Address {
    String streenNo;
    String location;
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

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

}
