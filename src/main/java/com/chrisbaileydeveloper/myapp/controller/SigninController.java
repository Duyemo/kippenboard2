package com.chrisbaileydeveloper.myapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import myapp.model.Response;

@Controller
public class SigninController {
	final Logger logger = LoggerFactory.getLogger(SigninController.class);
	
	/**
	 * Sign in page.
	 */
	@RequestMapping("/signin")
	public ResponseEntity<Response> getEmail() {
		return ResponseEntity.ok().body(new Response("test worked"));
	}
	/*public String signin() {
		logger.info("Showing sign in page");
		
		return "signin/signin";
	}*/
}
