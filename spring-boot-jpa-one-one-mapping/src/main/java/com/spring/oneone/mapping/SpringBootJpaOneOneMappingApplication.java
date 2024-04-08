package com.spring.oneone.mapping;

import org.aspectj.apache.bcel.Repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.oneone.mapping.operations.EmployeeOperations;

@SpringBootApplication
public class SpringBootJpaOneOneMappingApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(SpringBootJpaOneOneMappingApplication.class, args);
	EmployeeOperations ops= context.getBean(EmployeeOperations.class);
	ops.addEmployee();
	ops.deleteEmployee();
	}

}
