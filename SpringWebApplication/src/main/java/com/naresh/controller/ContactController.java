package com.naresh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.naresh.repository.ContactRepository;

@Controller
public class ContactController {
	
	@Autowired
	ContactRepository contarepo;

	@GetMapping("/index")
	public String showIndexPage() {
		return "index";
	}
	
	@GetMapping("/getcontacts")
	public String getContactlist(Model model) {
		model.addAttribute("contacts", contarepo.findAll());       
        return "contact";
		
	}
}
