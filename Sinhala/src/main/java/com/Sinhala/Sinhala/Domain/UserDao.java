package com.Sinhala.Sinhala.Domain;


import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "user2")
public class UserDao {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "fname")
    private String fname;
    @Column(name = "lname")
    private String lname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
