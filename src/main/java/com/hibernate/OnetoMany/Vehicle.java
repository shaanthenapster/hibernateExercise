package com.hibernate.OnetoMany;

import javax.persistence.*;

/**
 * Created by shaan on 2/7/17.
 */
@Entity
@Table
public class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Vehicle_id;
    String Vehicle_Type;
    String Vehicle_Name;

    public int getVehicle_id() {
        return Vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        Vehicle_id = vehicle_id;
    }

    public String getVehicle_Type() {
        return Vehicle_Type;
    }

    public void setVehicle_Type(String vehicle_Type) {
        Vehicle_Type = vehicle_Type;
    }

    public String getVehicle_Name() {
        return Vehicle_Name;
    }

    public void setVehicle_Name(String vehicle_Name) {
        Vehicle_Name = vehicle_Name;
    }
}
