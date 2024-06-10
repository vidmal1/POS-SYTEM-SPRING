package com.ijse.adminspring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.adminspring.entity.User;
/* 
import com.ijse.adminspring.dto.UserDto;

import com.ijse.adminspring.response.LoginMesage;
import com.ijse.adminspring.dto.LoginDto;*/

@Service
public interface UserService {

    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser (User user);
    User UpdateUser (Long id,User user);
    void deleteUser (Long id);
    /* 
    String addUser(UserDto userDto);
    LoginMesage loginUser(LoginDto loginDto);
    */
} 

