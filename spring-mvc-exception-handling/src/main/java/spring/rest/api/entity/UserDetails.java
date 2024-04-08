package spring.rest.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table
public class UserDetails {
	
	@NotBlank
	private String emailId;
	private String name;
	private long mobileNo;
	

}
