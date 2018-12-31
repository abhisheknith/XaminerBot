package org.cdac.xaminer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value= "/login", method= RequestMethod.POST)
	public String saveUser() {
		return "Username and passwords";
	}

}
