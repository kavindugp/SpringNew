package com.Sinhala.Sinhala.Controller;

import com.Sinhala.Sinhala.Domain.UserDao;
import com.Sinhala.Sinhala.Service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class User {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserDao> allUsers(){
        return userService.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDao userDao){
       return userService.addUser(userDao);

    }

    @PutMapping("/update")
    public String editUser(@RequestBody UserDao userDao){
        return userService.updateUser(userDao);

    }

}
