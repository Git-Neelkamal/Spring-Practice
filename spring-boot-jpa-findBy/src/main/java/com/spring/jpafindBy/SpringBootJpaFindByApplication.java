package com.spring.jpafindBy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.jpafindBy.db.operations.UserDetailsService;
import com.spring.jpafindBy.entity.UserDetails;

@SpringBootApplication
public class SpringBootJpaFindByApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootJpaFindByApplication.class, args);
	
	UserDetailsService service= context.getBean(UserDetailsService.class);
	

	service.addMoreUsers();
	
	}

}
