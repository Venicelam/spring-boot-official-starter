package com.oocl.web.sampleWebApp.controller;

import org.springframework.stereotype.Service;

@Service
public class User {


    public User(){}

    public User(int userId, String name) {
        this.name = name;
        this.userId = userId;
    }

    private int userId;
    private String name;

    public int getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }




}
