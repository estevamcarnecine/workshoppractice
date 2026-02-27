package com.estevamcarnecine.workshoppractice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.estevamcarnecine.workshoppractice.domain.User;
import com.estevamcarnecine.workshoppractice.repository.UserRepository;

@SpringBootApplication
public class WorkshoppracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshoppracticeApplication.class, args);
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