package com.ijse.adminspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    private String userName;

    private String email;

    private String password;
 
    private String role;
  
    
 /*  
public User(){


}

public User(long userId, String userName, String email, String password, String role){

    this.email = email;
    this.userId = userId;
    this.password = password;
    this.userName = userName;
    this.role = role;
}

@Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    */


}
