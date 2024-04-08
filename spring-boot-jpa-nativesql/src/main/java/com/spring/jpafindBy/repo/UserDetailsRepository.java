package com.spring.jpafindBy.repo;

import java.util.List;

import org.hibernate.type.TrueFalseConverter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.spring.jpafindBy.entity.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, String> {

	//@Query(value = "SELECT * FROM User_Details",nativeQuery = true)
	//List<UserDetails> loadAllUsers();
	
	
	@Query(value = "SELECT u FROM UserDetails u")
	List<UserDetails> loadAllUsersV2();
	
	@Query(value = "SELECT * FROM USER_DETAILS WHERE CITY=?1" ,nativeQuery = true)
	List<UserDetails> loadUsersByCity(String city);
	
	
	@Query(value = "SELECT * FROM USER_DETAILS WHERE CITY=?1 AND GENDER=?2" ,nativeQuery = true)
	List<UserDetails> loadUsersByCityAndGender(String city, String gender);
	
	
	@Query(value = "SELECT * FROM USER_DETAILS WHERE CITY=:cityName" ,nativeQuery = true)
	List<UserDetails> loadUsersByCityName(@Param("cityName") String city);
	
	
	@Query(value = "SELECT * FROM USER_DETAILS WHERE CITY=:cityName AND GENDER=:genderName" ,nativeQuery = true)
	List<UserDetails> loadUsersByCityAndGenderNames(@Param("genderName") String gender, @Param("cityName")String city);
	
}
