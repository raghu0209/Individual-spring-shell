package com.springshell.controller;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class UserController {
	
	private String name;
	private Long id;
	
	@ShellMethod("Add a new user")
	public String addUser(String name) {
		this.name = name;
		return "User " + this.name + " added successfully!";
	}
	
	@ShellMethod("Get user details by name")
	public String getUser(String name) {
		return this.name != null && this.name.equals(name) ? "User found: " + this.name : "User not found: " + this.name;
	}
	
	@ShellMethod("Add a new user with ID")
	public String addUserWithId(String name, Long id) {
		this.name = name;
		this.id = id;
		return "User " + this.name + " with ID " + this.id + " added successfully!";
	}
	
	@ShellMethod("Delete a user by ID")
	public String deleteUser(Long id) {
		return "User with ID " + this.id + " deleted successfully!";
	}

}
