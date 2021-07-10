package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	//fake user list
	List<User> list=List.of(
			new User(1311L,"Ronith Sinha","9819884856"),
			new User(1312L,"Ankit Tiwari","9919834559"),
			new User(1313L,"Ravi Tiwari","9419846566"));
	
	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}
	
}
