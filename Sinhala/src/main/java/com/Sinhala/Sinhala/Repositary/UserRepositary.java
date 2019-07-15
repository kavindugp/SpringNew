package com.Sinhala.Sinhala.Repositary;

import com.Sinhala.Sinhala.Controller.User;
import com.Sinhala.Sinhala.Domain.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositary extends JpaRepository<UserDao,Integer> {
}
