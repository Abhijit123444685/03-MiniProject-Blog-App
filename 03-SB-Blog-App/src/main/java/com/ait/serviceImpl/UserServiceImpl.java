package com.ait.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.entity.User;
import com.ait.entity.formbinding.LoginForm;
import com.ait.entity.formbinding.RegistraionForm;
import com.ait.repositories.UserRepo;
import com.ait.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo repo;

	@Override
	public boolean registerUser(RegistraionForm form) {
		
		User u=new User();
		
		BeanUtils.copyProperties(form,u );
		
		repo.save(u);
		
		return true;
	}
	@Override
	public boolean login(LoginForm form) {
		
		User userObj = repo.findByEmailAndPwd(form.getEmail(), form.getPwd());
		
		if(userObj!=null) {
			return true;
		}
		return false;
	}

}
