package com.user.micro.usercontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/status/check")
	public String getStatus() {
		return "Welcome to User Microservice ";
	}
	
}
