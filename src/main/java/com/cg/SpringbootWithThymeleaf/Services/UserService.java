package com.cg.SpringbootWithThymeleaf.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.SpringbootWithThymeleaf.Repo.UserRepository;
import com.cg.SpringbootWithThymeleaf.entities.User;
@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public boolean RegisterUser(User user) {
		repo.save(user);
		return true;
	
	}

}
