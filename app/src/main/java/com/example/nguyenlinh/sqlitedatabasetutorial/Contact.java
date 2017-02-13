package com.example.nguyenlinh.sqlitedatabasetutorial;

/**
 * Created by nguyenlinh on 13/02/2017.
 */

public class Contact {

    // private variables
    private int id;
    private String name, phoneNumber;

    // empty constructor
    public Contact() {
    }

    // contructor
    public Contact(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // constructor var = nam and phoneNumber
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
