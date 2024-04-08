package com.spring.jpafindBy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserDetails {
	@Id
	private String emailId;
	private String password;
	private String name;
	private String gender;
	private long contact;
	private String city;
	private String state;
	private String country;


	

	

}
