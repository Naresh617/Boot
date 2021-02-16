package com.naresh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.naresh.model.User;
import com.naresh.repository.UserRepository;

@SpringBootApplication
public class SpringBootJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcTemplateApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	public void run(String... args) throws Exception {

		User user1 = new User(0, "Admin", "admin@gmail.com");
		User savedUser = userRepository.create(user1);
		
		System.out.println("Saved user => " + savedUser);
		
		List users = userRepository.findAll();

		System.out.println("All users => " + users);
		
		User user = userRepository.findUserById(1);
		
		System.out.println("get user by id 1 => " + user);
	}

}
