package com.example.testtask.controller;

import com.example.testtask.model.Users;
import com.example.testtask.service.UserServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class Controller {
    UserServiceImp userServiceImp;

    @GetMapping
    public Users getUser(){
        return new Users(1l,"Vlad","Borisov","vlad@gmail.com","image","online");
    }

    @PostMapping()
    public long addUser(@RequestBody Users users){
       return userServiceImp.save(users);
    }
}
