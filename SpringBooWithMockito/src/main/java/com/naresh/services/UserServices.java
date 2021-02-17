package com.naresh.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.model.User;
import com.naresh.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	UserRepository userRepository;

	public User addUser(User user) {
		return userRepository.saveAndFlush(user);
	}

	public List<User> getUsersList() {
		return userRepository.findAll();
	}

	public List<User> getUsersByAddress(String address) {
		return userRepository.findByAddress(address);
	}

	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	
	public Optional<User> getUserById(int id) {
		return userRepository.findById(id);
	}
	
	

}
