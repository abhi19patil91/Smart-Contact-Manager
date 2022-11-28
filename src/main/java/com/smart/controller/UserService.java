package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

}
