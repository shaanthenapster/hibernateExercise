package com.hibernate.OnetoMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by shaan on 2/7/17.
 */
@Entity
public class Bachelor {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Bachelor_id")
    int Bid;
    String Name;
    String City;
    String Company;
    String MobileNo;
    @OneToMany
    @JoinTable
    private Collection<Vehicle>  vehicle = new ArrayList<Vehicle>();

    public Collection<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(Collection<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public int getBid() {
        return Bid;
    }

    public void setBid(int bid) {
        Bid = bid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

}
