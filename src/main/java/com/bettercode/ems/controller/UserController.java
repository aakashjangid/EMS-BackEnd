package com.bettercode.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bettercode.ems.model.User;
import com.bettercode.ems.service.UserService;

@RestController
@RequestMapping(value="users")
@CrossOrigin(origins="*")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping(value="/getAllRegisteredOrganizations")
	public List<User> getAllRegisteredOrganizations(){
		return userService.getAllRegisteredOrganizations();
	}
	
}