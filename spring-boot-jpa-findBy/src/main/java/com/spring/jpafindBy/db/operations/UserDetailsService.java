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
	JdbcTemplate template;
	
	
	@Autowired
	UserDetailsRepository repository;
	
	 Logger logger= LoggerFactory .getLogger(UserDetailsService.class);
	
	public void addUsers() {
		
		
		UserDetails user1= new UserDetails("one@mail.com","one123","one","male",1111111,"HYD","TG","India");
		
		System.out.println(user1);
		
		UserDetails user2= new UserDetails().builder().emailId("neelkamalbairla@gmail.com").password("kamal").name("kamal").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		System.out.println(user2);
		repository.save(user1);
		repository.save(user2);
	}
	
	
	public void addMoreUsers() {
		
		UserDetails user3= new UserDetails().builder().emailId("neelkamalbairla@gmail.com").password("kamal").name("one").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		UserDetails user4= new UserDetails().builder().emailId("sgbjsjkg@gmail.com").password("kamal").name("two").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		UserDetails user5= new UserDetails().builder().emailId("skjdbfj@gmail.com").password("kamal").name("three").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		UserDetails user6= new UserDetails().builder().emailId("sdjbgslgn@gmail.com").password("kamal").name("four").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		UserDetails user8= new UserDetails().builder().emailId("sdojbgosadg@gmail.com").password("kamal").name("five").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		UserDetails user9= new UserDetails().builder().emailId("sdojbgosadg@gmail.com").password("kamal").name("six").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		UserDetails user10= new UserDetails().builder().emailId("sdojbgosadg@gmail.com").password("kamal").name("seven").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		UserDetails user11= new UserDetails().builder().emailId("sdojbgosadg@gmail.com").password("kamal").name("eight").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		UserDetails user12= new UserDetails().builder().emailId("sdojbgosadg@gmail.com").password("kamal").name("nine").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		UserDetails user13= new UserDetails().builder().emailId("sdojbgosadg@gmail.com").password("kamal").name("ten").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		UserDetails user14= new UserDetails().builder().emailId("sdojbgosadg@gmail.com").password("kamal").name("eleven").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		UserDetails user15= new UserDetails().builder().emailId("sdojbgosadg@gmail.com").password("kamal").name("twelve").city("khammam").state("Telangana").country("India").contact(996666887).gender("male").build();
		
		
		//repository.saveAll(List.of(user3,user4,user5,user6,user8,user9,user10,user11,user12,user13,user14,user15));
		repository.save(user15);
		repository.save(user14);
	
		
	}
	
	/*public void loadUserByEmail(String email) {
		
		UserDetails userInfo= repository.findById(email).get();
		
		System.err.println(userInfo);
	}

	
		/*public void loadUserByCity(String city) {
			
			
			List<UserDetails> cityDetails= (List<UserDetails>) repository.findByCity(city);
		System.err.println(cityDetails);
		
		}*/
		
		
		/*public void loadUsersBycityAndGender(String city,String gender) {
			
			List<UserDetails> users= repository.findByCityAndGender(city,gender);
			
			logger.info("getting JPA Repo class name");
			System.out.println(users);
		}*/
		
		
}
