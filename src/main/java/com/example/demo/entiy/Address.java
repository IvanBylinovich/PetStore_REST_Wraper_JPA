package com.example.demo.entiy;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int home;

    public Address(String name, int home) {
        this.name = name;
        this.home = home;
    }

    public Address() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }
}
