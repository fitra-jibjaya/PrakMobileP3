package com.praktikum.prak5_mvp_room.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "person")
public class Person {

    @PrimaryKey (autoGenerate = true)
    private long id;
    private String name;
    private String address;
    private String phone;
    private String email;


    // Terdapat dua pilihan untuk mengatur datanya
    // 1. gather and setter

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 2. Constructor
    // Paramaeternya harus lengkap

    public Person(long id, String name, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}
