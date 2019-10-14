package com.testProj.demoTest;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,UUID>{
	
	List<User> findByEmail(@Param("email") String email);

}
