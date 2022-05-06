package com.example.backendassignment2.repository;


import com.example.backendassignment2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class userRepository {

    public User getUser(){
        return new User("abhishek","xyz rd",18);
    }

}
