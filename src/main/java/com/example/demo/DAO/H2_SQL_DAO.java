package com.example.demo.DAO;


import com.example.demo.entiy.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class H2_SQL_DAO implements UserDAO{

    @Autowired
    UserRepository userRepository;

    @Override
    public User getByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public List<User> createList(List<User> users) {
        return null;
    }

    @Override
    public User updateByUsername(String userName) {
        return null;
    }

    @Override
    public void deleteByUsername(String userName) {

    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
