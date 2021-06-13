package com.example.demo.DAO;


import com.example.demo.entiy.User;

import java.util.List;

public interface UserDAO {
    User getByUsername(String string);
    List<User> createList(List<User> users);
    User updateByUsername(String userName);
    void deleteByUsername(String userName);
    void save(User user);
}
