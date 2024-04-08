package spring.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.rest.api.dto.UserRegisterDto;
import spring.rest.api.entity.UsersData;
import spring.rest.api.repository.USerRepo;

@Service
public class UserService {

	
	@Autowired
	USerRepo uSerRepo;
	public String registerUser(UserRegisterDto request) {
		
		// object mapping
		
		UsersData data= new UsersData();
		data.setEmail(request.getEmail());
		data.setFirstName(request.getFirstName());
		data.setLastName(request.getLastName());
		data.setGender(request.getGender());
		data.setDobYear(request.getDobYear());
		data.setMobile(request.getMobile());
		data.setPassword(request.getPassword());
		
		uSerRepo.save(data);
		
		
		return "registration successful";
	}
	public static List<UsersData> getUserInformationByCityAndGender(String city, String gender) {
		
		
		
		return USerRepo.findByCityAndGender(city,gender);
	}

}
