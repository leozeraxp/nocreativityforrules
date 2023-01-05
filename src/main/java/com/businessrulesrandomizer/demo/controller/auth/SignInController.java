package com.businessrulesrandomizer.demo.controller.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
public class SignInController {

	@GetMapping("/sign/in")
	public ResponseEntity index() {
		return ResponseEntity.ok("Sign in page");
	}

}
