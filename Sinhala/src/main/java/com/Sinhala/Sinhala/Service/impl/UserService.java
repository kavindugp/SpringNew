package com.Sinhala.Sinhala.Service.impl;

import com.Sinhala.Sinhala.Domain.UserDao;
import com.Sinhala.Sinhala.Repositary.UserRepositary;
import com.Sinhala.Sinhala.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServices {

    @Autowired
    private UserRepositary userRepositary;

    @Override
    public List<UserDao> findAllUsers() {
         List < UserDao> allusers=userRepositary.findAll();
         return allusers;
    }

    @Override
    public String addUser(UserDao userDao) {
        userRepositary.save(userDao);
        return "Data saved";
    }


    @Override
    public String updateUser(UserDao UpdateduserDao) {

        String msg=null;
        if (UpdateduserDao.getId() != 7){
            userRepositary.save(UpdateduserDao);
            msg="updated";
        }
        return msg;
    }
}
