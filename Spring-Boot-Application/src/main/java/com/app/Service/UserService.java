package com.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.Users;
import com.app.Repository.UserRepository;
@Service
public class UserService {
@Autowired
private UserRepository userRepository;

public Users registerUser(Users  user) {
	return userRepository.save(user);
}
public Users loginUser(String email,String Password) {
	Users users=userRepository.findByEmail(email);
	if(users!=null && Password.equals(users.getPassword()))
		return users;
	return null;
}
}
