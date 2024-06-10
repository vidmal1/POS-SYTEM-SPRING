package com.ijse.adminspring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.ijse.adminspring.entity.User;

@EnableJpaRepositories
@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

  /*  Optional<User> findOneByEmailAndPasswordAndRole(String email, String password,String role);
    User findByEmail(String email);*/

    

    
} 
