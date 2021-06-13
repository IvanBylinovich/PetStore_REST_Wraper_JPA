package com.example.demo.controller;

import com.example.demo.entiy.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserRepository userRepository;


    @PostMapping
    public User registration (@RequestBody User user){
        userRepository.save(user);

        return user;
    }
    @PostMapping("/saveUsers")
    public List<User> registration (@RequestBody List<User> users){
        userRepository.saveAll(users);
        return users;
    }

    @DeleteMapping
    public void delete (String username){
        userRepository.deleteByUsername(username);
    }

    @GetMapping
    public User getByUsername (String username){
        return userRepository.getUserByUsername(username);
    }

    @PutMapping
    public User UpDate (@RequestBody User user){
        userRepository.save(user);
        return user;
    }



}
