package com.ait.entity.formbinding;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class RegistraionForm {
	
	public  String firstName;
	 
	public String lastName;
	 
	public String email;
	 
	public String pwd;
	 

}
