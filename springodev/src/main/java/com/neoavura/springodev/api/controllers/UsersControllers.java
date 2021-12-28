package com.neoavura.springodev.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoavura.springodev.business.abstracts.UserService;
import com.neoavura.springodev.core.utilities.results.DataResult;
import com.neoavura.springodev.core.utilities.results.Result;
import com.neoavura.springodev.entities.concrete.User;


@RestController
@RequestMapping("/api/users")
public class UsersControllers {
	private UserService userService;

	@Autowired
	public UsersControllers(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody User user) {
		return this.userService.update(user);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody User user) {
		return this.userService.delete(user);
	}
}
