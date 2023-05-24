package com.larramendi.larraCRUD;

import com.larramendi.larraCRUD.entities.User;
import com.larramendi.larraCRUD.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LarraCruDprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LarraCruDprojectApplication.class, args);
	}

}
