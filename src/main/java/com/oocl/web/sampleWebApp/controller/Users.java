package com.oocl.web.sampleWebApp.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Users {
    private List<User> users;
    private int idIndex = 0;

    public Users() {
        this.users = new ArrayList<>();
        this.users.add(new User(1,"Amy"));

    }
    public List<User> getAll() {

        return users;
    }
    public int create(User user) {
        this.idIndex = this.idIndex + 1;
            user.setUserId(idIndex);
        this.users.add(user);
        return idIndex;
    }




}
