package spring.rest.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.rest.api.entity.UsersData;


@Repository
public interface USerRepo  extends JpaRepository<UsersData, String>{

	
	static List<UsersData> findByCityAndGender(String city, String gender) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
