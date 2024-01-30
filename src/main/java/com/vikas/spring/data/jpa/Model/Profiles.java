package com.vikas.spring.data.jpa.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Profile")
public class Profiles {

//    private Profiles(){
//        System.out.println("inside the model class");
//    }

    @Id
    private int userId ;

    private String name;

    private String contactNo;

    private String email;

    private String address;


    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
