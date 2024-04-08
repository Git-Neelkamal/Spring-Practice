package spring.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.rest.api.dto.UserRegisterDto;
import spring.rest.api.dto.UserRegisterDtoV2;
import spring.rest.api.entity.UsersData;
import spring.rest.api.service.UserService;
import spring.rest.api.dto.MoreUsersInformation;
@RestController
@RequestMapping("/user")
public class UserController {
	
	
	
	@Autowired
	UserService service;
	
	@PostMapping("/register")
	 public String registerUser(@RequestBody UserRegisterDto request) {
		
	System.out.println(request);
		
		String result = service.registerUser(request);
		
		 
		 return result;
		 
	}  
	
	
	
//to Create more users
	/*@PostMapping("/register/more")
	 public String registerMoreUser(@RequestBody List<UserRegisterDto> users) {
		
		
		users.forEach(System.out::println);
		
		String result = service.registerUser(request);
		
		 
		 return "Users added Successfully";
		 
	 }  */
	
	

	@GetMapping("/load")
	 public UserRegisterDto loadAlluser() {
		
		
		
		 
		 return new UserRegisterDto();
		 
	 }  
	
	@PostMapping("/v2/register")
	 public String registerUserWithAddress(@RequestBody UserRegisterDtoV2 request) {
		
		
		System.out.println(request);
		System.out.println(request.getDetails());
		
		
		 
		 return "User registered successfully";
		 
	 } 
	
	
	
	@GetMapping("city/{city}/gender/{gender}")
	public List<UsersData> getUserInformationByCityAndGender(@PathVariable("gender") String gender, @PathVariable("city") String city) {
		
		
		return UserService.getUserInformationByCityAndGender(city,gender);
		
		
	}
	

}
