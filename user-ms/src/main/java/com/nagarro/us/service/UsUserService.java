package com.nagarro.us.service;

import org.springframework.stereotype.Service;

import com.nagarro.us.entity.UsUserVO;

@Service
public class UsUserService {
	
	public UsUserVO getUserDetails(Long id) {
		UsUserVO user = new UsUserVO();
		user.setName("Neha");
		user.setAge(22);
		user.setEmail("neha@gmail.com");
		return user;
	}
}
