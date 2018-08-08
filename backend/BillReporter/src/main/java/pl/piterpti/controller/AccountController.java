package pl.piterpti.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	public static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@CrossOrigin
	@RequestMapping("/user")
	public Principal user(Principal principal) {
		return principal;
	}
}
