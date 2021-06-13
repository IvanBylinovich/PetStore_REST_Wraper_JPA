package com.example.demo.repository;

import com.example.demo.entiy.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends CrudRepository<User, Long> {
     void deleteByUsername(String username);
     User getUserByUsername(String username);

}
