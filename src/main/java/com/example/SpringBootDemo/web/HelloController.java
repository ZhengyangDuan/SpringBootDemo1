package com.example.SpringBootDemo.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	@RequestMapping("/say")
	public String hello() {
		return "Hello World.";
	}
}
