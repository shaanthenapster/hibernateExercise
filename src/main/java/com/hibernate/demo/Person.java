package com.hibernate.demo;

import javax.persistence.*;

/**
 * Created by shaan on 1/7/17.
 */
@Entity
public class Person {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int pid;
    @Column
    String pname;
    @Column
    String paddress;
    @Column
    String pmobile;
    @OneToOne
    @JoinColumn(name = "Mobile_join_colounm")
    private Mobile mobile;
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public String getPmobile() {
        return pmobile;
    }

    public void setPmobile(String pmobile) {
        this.pmobile = pmobile;
    }
    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", paddress='" + paddress + '\'' +
                ", pmobile='" + pmobile + '\'' +
                '}';
    }

}
