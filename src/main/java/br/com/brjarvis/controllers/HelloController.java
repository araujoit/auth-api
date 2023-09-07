package br.com.brjarvis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brjarvis.config.ApplicationConfig;

@RestController
public class HelloController {
	
	@Autowired
	private ApplicationConfig applicationConfig;

	@RequestMapping("/")
	public String home() {
		return "Olá Mundo! Username: " + applicationConfig.getUserName() + ", Password:" + applicationConfig.getPassword();
	}
}
