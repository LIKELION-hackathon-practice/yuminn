// src/main/java/com.example.Backend.Study/service/UserService.java
package com.example.Backend.Study.service;

import com.example.Backend.Study.dto.UserDto;
import com.example.Backend.Study.entity.User;
import com.example.Backend.Study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        return userRepository.save(user);
    }
}
