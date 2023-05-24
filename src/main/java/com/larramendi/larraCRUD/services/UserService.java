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

    public UserDto createUser(UserDto userDto) {
        User user = new User(
                userDto.getId(), userDto.getName(), userDto.getEmail(), userDto.getPassword()
        );
        User savedUser = userRepository.save(user);
        return new UserDto(savedUser);
    }

    public UserDto updateUser(UserDto userDto) {
        User existenteUser = userRepository.findById(userDto.getId()).get();
        existenteUser.setName(userDto.getName());
        existenteUser.setEmail(userDto.getEmail());
        existenteUser.setPassword(userDto.getPassword());
        User updatedUser = userRepository.save(existenteUser);
        return new UserDto(existenteUser);
    }

    public List<UserDto> getAllUsers() {
        List<User> saveUsers = userRepository.findAll();
        return saveUsers.stream().map((UserDto::new)).toList();
    }

    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id).get();
        return new UserDto(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
