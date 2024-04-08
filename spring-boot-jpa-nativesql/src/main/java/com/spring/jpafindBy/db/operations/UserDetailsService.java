package com.spring.jpafindBy.db.operations;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jpafindBy.entity.UserDetails;
import com.spring.jpafindBy.repo.UserDetailsRepository;

@Component
public class UserDetailsService {
	
	@Autowired
	UserDetailsRepository repository;
	
	
	
	
	
	public void loadAllUsersV2() {
		
		
		List<UserDetails> usersDetails=	repository.loadAllUsersV2();
			usersDetails.forEach(System.out::println);
		}
	
	public void loadUsersByCity(String city) {
		
		List<UserDetails> users= repository.loadUsersByCity(city);
		
		users.forEach(System.out::println);

		
}
	
public void loadUsersByCityAndGender(String city, String gender) {
		
		List<UserDetails> users= repository.loadUsersByCityAndGender(city,gender);
		
		users.forEach(System.out::println);
}

public void loadUsersByCityName(String city) {
	
	List<UserDetails> users= repository.loadUsersByCityName(city);
	
	users.forEach(System.out::println);


}
public void loadUsersByCityAndGenderNames(String gender, String city) {
	
	List<UserDetails> users= repository.loadUsersByCityAndGenderNames(gender,city);
	
	users.forEach(System.out::println);
}
}
