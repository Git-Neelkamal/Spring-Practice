package spring.rest.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.rest.api.dto.UserRegister;
import spring.rest.api.entity.UserDetails;
import spring.rest.api.repository.UserRepository;

@Service 
public class UserService {

	@Autowired
	UserRepository repository;
	
	public String addUserInfo(UserRegister request) {
		
		UserDetails details=new UserDetails();
		
		details.setEmailId(request.getEmailId());
		details.setMobileNo(request.getMobileNo());
		details.setName(request.getName());
		
		repository.save(details);
		
		return "User Registered successfully";
		
	}
	
	

}
