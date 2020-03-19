package com.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.profileservice.DashBoardProxy;

@RestController
public class ProfileController {

	@Autowired
	DashBoardProxy proxy;
	
	@GetMapping("/myprofile")
	public String getProfile() {
		return proxy.getDashboard();
	}
	
	@GetMapping("/editprofile")
	public String editProfile() {
		return "Hello from Edit Profile";
	}
	
}
