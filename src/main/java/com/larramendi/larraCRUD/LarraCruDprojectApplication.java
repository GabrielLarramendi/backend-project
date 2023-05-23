package com.larramendi.larraCRUD;

import com.larramendi.larraCRUD.entities.User;
import com.larramendi.larraCRUD.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LarraCruDprojectApplication {

	@Bean
	public CommandLineRunner run(UserRepository userRepository) {
		return (args) -> {
			insertFourUsers(userRepository);
			System.out.println(userRepository.findAll());
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(LarraCruDprojectApplication.class, args);
	}

	private void insertFourUsers(UserRepository userRepository) {
		userRepository.save(new User(1L,"Gabriel", "gabriel@gmail.com", "123456"));
		userRepository.save(new User(2L,"Sabrina", "sabrina@gmail.com", "123456"));
		userRepository.save(new User(3L,"Raquel", "raquel@gmail.com", "123456"));
		userRepository.save(new User(4L,"Estela", "estela@gmail.com", "123456"));
	}


}
