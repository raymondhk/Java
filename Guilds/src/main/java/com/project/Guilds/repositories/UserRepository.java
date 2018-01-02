package com.project.Guilds.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Guilds.models.User;

@Repository 												
public interface UserRepository extends CrudRepository<User,Long>{
	List<User> findAll();
	User findByEmail(String email);
	User findByUsername(String username);
	User findById(Long id);
}
