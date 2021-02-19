package com.naresh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.exceptions.CricketerNotFoundException;
import com.naresh.model.Cricketer;
import com.naresh.repository.CricketerRepository;

@RestController
public class CricketerController {

	@Autowired
	CricketerRepository repo;

	@PostMapping("/addCricketer")
	public Cricketer addCricketer(@RequestBody Cricketer cricketer) {
		return repo.saveAndFlush(cricketer);
	}

	@GetMapping("/allCricketer")
	public List<Cricketer> getAllCircketers() {
		return repo.findAll();
	}
	
	@GetMapping("/getById/{id}")
	public Optional<Cricketer> getCricketerById(@PathVariable int id )
	{
		Optional<Cricketer> cricketer = repo.findById(id);
		if(!cricketer.isPresent()) {
			throw new CricketerNotFoundException("Id Not Found"+id);
		}
		return cricketer;
	}

}
