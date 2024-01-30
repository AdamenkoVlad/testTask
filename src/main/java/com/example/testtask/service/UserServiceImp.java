package com.example.testtask.service;

import com.example.testtask.model.Users;
import com.example.testtask.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
@AllArgsConstructor
public class UserServiceImp implements UserService{
    UserRepository userRepository;
    @Override
    public long save(Users users) {
      long id = userRepository.save(users).getId();
      return id;
    }

    @Override
    public Users findById(long id) {
        return null;
    }

    @Override
    public Map<String, String> updateUser(long id) {
        return null;
    }
}
