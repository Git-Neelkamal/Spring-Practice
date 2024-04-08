package com.spring.oneone.mapping.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.oneone.mapping.entity.Address;
import com.spring.oneone.mapping.entity.Employee;
import com.spring.oneone.mapping.repo.EmployeeRepository;

@Component
public class EmployeeOperations {
	
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public void addEmployee() {
		
		
		Employee emp = new Employee();
		//emp.setEmpId(001);
		emp.setEmpName("Two");
		emp.setSalary(1000000);
		
		Address address= new Address();
		//address.setAddressId(1);
		address.setAreaName("ABC Nagar");
		address.setCity("Bang");
		address.setPincode(500077);
		
		
		
		emp.setAddress(address);
		employeeRepository.save(emp);
	
	
	}
	
	
	public void deleteEmployee() {
		
		// delete operation cascading to target table also
		employeeRepository.deleteById(2);
	}
	
	
	

}
