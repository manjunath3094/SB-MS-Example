package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	
	@GetMapping(value = "/hello/{name}")
	public String greetMsg(@PathVariable("name") String name) {
		
		return "Hi Good Morning...." + name;
	}

}
