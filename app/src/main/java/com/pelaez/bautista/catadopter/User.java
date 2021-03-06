package com.pelaez.bautista.catadopter;

/**
 * Created by kurtv on 7/19/2016.
 */
public class User {

    private String uid;
    private String email;
    private String name;
    private String contactNumber;

    public User() {

    }

    public User(String uid, String email, String name, String contactNumber)
    {
        this.uid = uid;
        this.email = email;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

}
