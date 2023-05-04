package com.ait.service;

import org.springframework.stereotype.Service;

import com.ait.entity.formbinding.LoginForm;
import com.ait.entity.formbinding.RegistraionForm;

@Service
public interface UserService {
       
	public boolean registerUser(RegistraionForm form);
	
	public boolean login(LoginForm form);
}
