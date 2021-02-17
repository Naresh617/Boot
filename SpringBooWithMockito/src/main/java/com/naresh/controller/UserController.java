package com.naresh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.model.User;
import com.naresh.services.UserServices;

@RestController
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
public class UserController {

	@Autowired
	UserServices userServices;

	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return userServices.addUser(user);
	}

	@GetMapping("/getUsers")
	public List<User> findAllUsers() {
		return userServices.getUsersList();
	}
	@GetMapping("/getUserByAddress/{address}")
	public List<User> findUserByAddress(@PathVariable String address) {
		return userServices.getUsersByAddress(address);
	}

	@DeleteMapping(value = "/remove/{id}")
	public void removeUser(@PathVariable int id) {
		userServices.deleteUser(id);
	}
	
	@GetMapping(value="/user/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		return  userServices.getUserById(id);
	}
	
	@PutMapping("/saveUser")
	public User UpdateUser(@RequestBody User user) {
		return userServices.addUser(user);
	}

}
