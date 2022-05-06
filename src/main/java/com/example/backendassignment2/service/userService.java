package com.example.backendassignment2.service;

import com.example.backendassignment2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.backendassignment2.repository.userRepository;

@Service
public class userService {

    @Autowired
    private userRepository userRepository;

    public User getUser(){
        return userRepository.getUser();
    }

}
