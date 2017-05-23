package com.shyam0507.github.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shyam0507.github.model.User;
import com.shyam0507.github.repo.UserRepository;

@RestController
public class HelloController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "Hello World!";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public User getUser(@PathVariable("id") Long id) {
		System.out.println(userRepository.findOne(id));
		//return null;
		 return userRepository.findOne(id);
	}

}
