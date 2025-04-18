package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
  
	Users findByEmail(String email);
}
