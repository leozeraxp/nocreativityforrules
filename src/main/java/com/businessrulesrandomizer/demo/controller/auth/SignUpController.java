package com.businessrulesrandomizer.demo.controller.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {
	
	@GetMapping("auth/sign/up")
	public ResponseEntity index() {
		return ResponseEntity.ok("Sign up page");
	}

}
