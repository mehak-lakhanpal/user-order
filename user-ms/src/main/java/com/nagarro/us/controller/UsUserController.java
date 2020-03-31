package com.nagarro.us.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.us.entity.UsUserVO;
import com.nagarro.us.service.UsUserService;


@RestController
public class UsUserController {
	
	@Autowired
	private UsUserService usUserService;
	
	@GetMapping(value = "/user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsUserVO> getUser(@PathVariable Long userId){
		return ResponseEntity.ok(usUserService.getUserDetails(userId));
	}
}
