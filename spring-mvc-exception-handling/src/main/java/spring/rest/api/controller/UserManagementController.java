package spring.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import spring.rest.api.dto.UserRegister;
import spring.rest.api.dto.UserRegister;
import spring.rest.api.service.UserService;

@RestController
@RequestMapping("/user")
public class UserManagementController {
	
	@Autowired
	 UserService service;

	@PostMapping("/register")
	 public String addUser(@Valid @RequestBody UserRegister request) {
		 
		 String result = service.addUserInfo(request);
		 return result;
	 }
	
	
}
