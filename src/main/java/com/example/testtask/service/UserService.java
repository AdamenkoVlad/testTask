package com.example.testtask.service;

import com.example.testtask.model.Users;

import java.util.Map;

public interface UserService {

    long save(Users users);
    Users findById(long id);

    Map<String,String> updateUser(long id);

}
