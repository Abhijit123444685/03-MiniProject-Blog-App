package com.ait.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ait.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
	
	public User  findByEmailAndPwd(String email, Object pwwd);

}
