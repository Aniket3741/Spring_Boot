package com.springmvc.service;

import org.springframework.stereotype.Service;

import com.springmvc.entity.User;

@Service
public interface UserService {

	public int registerUser(User user);

}