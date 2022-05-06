package com.example.backendassignment2.resource;

import com.example.backendassignment2.model.User;
import com.example.backendassignment2.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private userService userService;

    @GetMapping("/user")
    public User getUser(){
        return userService.getUser();
    }

}
