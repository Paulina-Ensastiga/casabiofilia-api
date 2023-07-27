package com.casabiofilia.casabiofilia.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casabiofilia.casabiofilia.Entity.User;

import com.casabiofilia.casabiofilia.Service.UserService;



@RequestMapping(path="/casabiofilia/user")

@RestController

public class UserController {
private final UserService userService; 

@Autowired
public UserController(UserService userService) {
	this.userService = userService;
}
@GetMapping
public List<User> getUser(){
	return userService.getAllUser();
	
}

//Get individual
@GetMapping("/{id}")
public User getUserById(@PathVariable Long id) {
	return userService.getUserById(id);
}

@PostMapping
public User createUser(@RequestBody User user) {
	return userService.createUser(user);
}

@PutMapping
public User updateUser(@RequestBody User user) {
	return userService.updateUser(user);
}
//Delete mappping
@DeleteMapping("/{id}")
public void deleteUser(@PathVariable Long id) {
	userService.deleteUser(id);
}
}
