package spring.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.rest.api.entity.UserDetails;
@Repository
public interface UserRepository extends JpaRepository<UserDetails, String>{

}
