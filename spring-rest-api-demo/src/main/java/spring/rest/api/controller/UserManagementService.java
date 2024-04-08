package spring.rest.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementService {
	
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	 	
	public String sayHello() {
		
		
		return "hello world!!, this is an example of rest services";
	}
	
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)

	public UserInformation myInfo() {
		
     UserInformation information=   UserInformation.builder().emailString("kamal@gmail.com").age(24).id(456).build();		
	
     return information;
     
	}
	
	
	
	@RequestMapping(value = "/add/user", method = RequestMethod.GET)
	
	public String addUser() {
		
     
	
     return "used added successfully";
     
	}

}
