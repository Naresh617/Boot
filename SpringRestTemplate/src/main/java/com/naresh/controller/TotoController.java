package com.naresh.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TotoController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/todslist")
	public String todoList() {
		HttpHeaders headers =new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity = new HttpEntity<>(headers);
	      return restTemplate.exchange("https://reqres.in/api/users?page=2", HttpMethod.GET, entity, String.class).getBody();
		
	}

}
