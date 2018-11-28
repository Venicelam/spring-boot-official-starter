package com.oocl.web.sampleWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/")

public class UserController {
    Users users;

    @Autowired
    public UserController(Users users) {
        this.users = users;
    }



    @GetMapping(path = "/", produces = {"application/json"})
    public ResponseEntity<List<User>> getAll() {

        List<User> user = users.getAll();

        return ResponseEntity.ok(user);
    }

    @PostMapping(path = "/users/{userId}", produces = {"application/json"})
    public ResponseEntity<String> create(@RequestBody User user) {
        return ResponseEntity.created(URI.create("/users/" + user.getUserId())).build();
    }
}
