package com.sit.teach.controller;

import com.sit.teach.entity.User;
import com.sit.teach.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUer(@PathVariable("id")Integer id){
        User user=userRepository.getOne(id);
        return user;
    }
    @GetMapping("/user")
    public User insertUser(User user){
        User save=userRepository.save(user);
        return save;
    }
}
