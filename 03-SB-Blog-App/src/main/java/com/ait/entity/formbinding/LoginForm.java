package com.ait.entity.formbinding;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LoginForm {
	
	String email;
	
	String pwd;

}
