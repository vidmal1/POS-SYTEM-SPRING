package com.ijse.adminspring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.ijse.adminspring.entity.User;
import com.ijse.adminspring.repository.UserRepository;
/* 
import com.ijse.adminspring.response.LoginMesage;
import com.ijse.adminspring.dto.LoginDto;
import com.ijse.adminspring.dto.UserDto;
import org.springframework.security.crypto.password.PasswordEncoder;

*/

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    /* 
    @Autowired
    private PasswordEncoder passwordEncoder;

    */

    @Override
    public List<User> getAllUsers(){

        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id){

        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User createUser (User user){
        return userRepository.save(user);
    }
    
    @Override
    public User UpdateUser (Long id,User user){
       
        User existUser = userRepository.findById(id).orElse(null);

        if ( existUser != null ){

            existUser.setUserName(user.getUserName());
            existUser.setEmail(user.getEmail());
            existUser.setRole(user.getRole());
            return userRepository.save(existUser);

        }else {
            return null;
        }
    }

    @Override
    public void deleteUser (Long id){
        userRepository.deleteById(id);
    }


    /* 
    @Override  
    public String addUser(UserDto userDto) {
        User user = new User(


        userDto.getUserId(),
        userDto.getUserName(),
        userDto.getEmail(),
        userDto.getRole(),
        this.passwordEncoder.encode(userDto.getPassword())

        );

        userRepository.save(user);
        return user.getUserName();
       
    }

    @Override
    public LoginMesage  loginUser(LoginDto loginDto) {
        String msg = "";
        User User1 = userRepository.findByEmail(loginDto.getEmail());

        if (User1 != null) {
            String role= loginDto.getRole();
            String password = loginDto.getPassword();
            String encodedPassword = User1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> foundUser = userRepository.findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);
                if (foundUser.isPresent()) {
                    return new LoginMesage("Login Success", true);
                } else {
                    return new LoginMesage("Login Failed", false);
                }
            } else {
                return new LoginMesage("password Not Match", false);
            }
        }else {
            return new LoginMesage("Email not exits", false);
        }
    }
    */



}
