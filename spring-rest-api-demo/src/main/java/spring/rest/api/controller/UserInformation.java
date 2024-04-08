package spring.rest.api.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInformation {
	
	private String emailString;
	private int id;
	private int age;
	

}
