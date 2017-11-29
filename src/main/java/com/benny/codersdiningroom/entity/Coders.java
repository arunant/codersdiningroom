package com.benny.codersdiningroom.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coders {
    @Id
    private Integer id;
    private String name;
    private String phone;
    private String address;
    public Coders(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
