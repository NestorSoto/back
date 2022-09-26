package com.example.back.controller;

import com.example.back.entities.User;
import com.example.back.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login() {
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User newUser) {
        repository.save(newUser);

        return ResponseEntity.ok(repository.save(newUser));
    }
    @GetMapping("/users")
    public List<User> findAll(){
        return repository.findAll();
    }
}
