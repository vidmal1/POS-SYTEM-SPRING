package com.ijse.adminspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

/* 
import com.ijse.adminspring.dto.LoginDto;
import com.ijse.adminspring.dto.UserDto;
import com.ijse.adminspring.response.LoginMesage;
*/
import com.ijse.adminspring.entity.User;

import com.ijse.adminspring.service.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;







@RestController
@CrossOrigin(origins="*")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> getAllUsers(){

        return userService.getAllUsers();
        
    }

    /* 
    @PostMapping("/save")
    public String saveUser(@RequestBody UserDto userDto)
    {
        String id = userService.addUser(userDto);
        return id;
    }
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDto loginDto)
    {
        LoginMesage loginmessage = userService.loginUser(loginDto);
        return ResponseEntity.ok(loginmessage);
    }

    */

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){ 
        
        return userService.createUser(user);
    }

    @PutMapping("/users/{id}")
    public User UpdateUser(@PathVariable Long id, @RequestBody User user) {
        
        
        return userService.UpdateUser(id, user);
    }
    
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    
    }
    
