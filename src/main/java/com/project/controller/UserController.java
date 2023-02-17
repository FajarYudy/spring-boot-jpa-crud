package com.project.controller;

import com.project.model.User;
import com.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author fajaryudi
 * @created 2023/02/17 - 11.46
 */
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User findByid(@PathVariable("id") long id){
        return userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not " +
                "found"));
    }

    @PostMapping
    public User insert(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public User update(@RequestBody User user, @PathVariable("id") long id){
        User userData = userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not " +
                "found"));
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public User delete(@PathVariable("id") long id){
        User user = userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not " +
                "found"));
        userRepository.delete(user);
        return user;
    }
}
