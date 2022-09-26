package com.example.back.repository;


import com.example.back.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
//
//    List<User> findByCompanyName(String username);
//
//    Boolean existsByUsername(String username);
//
//    Boolean existsByEmail(String email);

}

