package com.naresh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.model.Contact;
import com.naresh.repository.ContactRepository;

@RestController
public class RestContactController {

	@Autowired
	ContactRepository repo;

	@PostMapping("/addContact")
	public Contact addContact(@RequestBody Contact contact) {
		return repo.save(contact);

	}

}
