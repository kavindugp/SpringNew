package com.Sinhala.Sinhala.Service;

import com.Sinhala.Sinhala.Domain.UserDao;

import java.util.List;

public interface UserServices {

     List<UserDao> findAllUsers();

     String addUser(UserDao userDao);

     String updateUser(UserDao userDao);
}
