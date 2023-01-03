package com.businessrulesrandomizer.demo.controller.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {

	@GetMapping("/auth/sign/in")
	public ResponseEntity olaMundo() {
		return ResponseEntity.ok("Sign in page");
	}

}
