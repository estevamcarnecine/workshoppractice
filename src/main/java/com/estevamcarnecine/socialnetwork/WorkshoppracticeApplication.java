package com.estevamcarnecine.socialnetwork;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.estevamcarnecine.socialnetwork.domain.User;
import com.estevamcarnecine.socialnetwork.repository.UserRepository;

@SpringBootApplication
public class socialnetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(socialnetworkApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository repo) {
		return args -> {
			repo.deleteAll(); 
			repo.save(new User(null, "alex green", "alex@gmail.com"));
			repo.save(new User(null, "maria", "maria@gmail.com"));
			System.out.println("Database seeded!");
		};
	}
}