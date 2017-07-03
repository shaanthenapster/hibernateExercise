package com.hibernate.demo;

import javax.persistence.*;

/**
 * Created by shaan on 1/7/17.
 */
@Entity
@Table(name = "Mobile")
public class Mobile {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int mid;
    @Column(name = "Mobile_Name")
    String mname;
    @Column(name = "Mobile_Company")
    String mcompany;
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMcompany() {
        return mcompany;
    }

    public void setMcompany(String mcompany) {
        this.mcompany = mcompany;
    }
    @Override
    public String toString() {
        return "Mobile{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mcompany='" + mcompany + '\'' +
                '}';
    }



}
