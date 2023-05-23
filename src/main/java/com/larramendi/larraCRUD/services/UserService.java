package com.larramendi.larraCRUD.services;

import com.larramendi.larraCRUD.dto.UserDto;
import com.larramendi.larraCRUD.entities.User;
import com.larramendi.larraCRUD.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDto> getAllUsers() {
        List<User> saveUsers = userRepository.findAll();
        return saveUsers.stream().map((UserDto::new)).toList();
    }
}
