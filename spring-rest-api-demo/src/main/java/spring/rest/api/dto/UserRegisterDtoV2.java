package spring.rest.api.dto;

import lombok.Data;

@Data
public class UserRegisterDtoV2 {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String password;
	private int dobYear;
	private String email;
	private long mobile;
	
	private AddressDetails details;
	

	
	
}
