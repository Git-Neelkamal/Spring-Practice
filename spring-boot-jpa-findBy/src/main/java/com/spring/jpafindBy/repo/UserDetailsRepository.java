package com.spring.jpafindBy.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.jpafindBy.entity.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, String> {

	/*List<UserDetails> findByCity(String city);

	List<UserDetails> fingByCity(String city);*/



	//List<UserDetails> findByCityAndGender(String city, String gender);

}
