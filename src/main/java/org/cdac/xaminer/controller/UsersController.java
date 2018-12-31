package org.cdac.xaminer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UsersController {

	 @RequestMapping("/getUser/{userId}")
	 public String getUserById(@PathVariable Integer userId) {
		 return "Return user 1";
	 }
}
