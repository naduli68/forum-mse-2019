package com.mse.forum.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mse.forum.dto.UserDTO;
import com.mse.forum.services.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(path="/users")
@CrossOrigin(origins = "*")
public class UserControler {
	private UserService service;
	
	@RequestMapping(method = RequestMethod.POST,consumes= "application/json")
	public void createUser(@RequestBody UserDTO user){
		service.saveUser(user);
		
	
	}
	

}
