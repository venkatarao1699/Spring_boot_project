package com.cg.SpringbootWithThymeleaf.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.SpringbootWithThymeleaf.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{@Override
default long count() {
	// TODO Auto-generated method stub
	return 0;
}

}
