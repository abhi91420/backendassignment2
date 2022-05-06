package com.example.backendassignment2.resource;

import com.example.backendassignment2.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserResource {

    @GetMapping("/user")
    public User getUser(){

        User user = new User("abhishek","xyz rd",18);
        return user;
    }

}
