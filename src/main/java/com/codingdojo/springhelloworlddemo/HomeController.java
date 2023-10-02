package com.codingdojo.springhelloworlddemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "Hello user!";
	}
	@RequestMapping("/start")
	public String start() {
		return "Saturday Day Review - Code EveryDay you can! 9/30/23 2:19 pm";
	}
	@RequestMapping("/world")
	public String world() {
		return "Class annotations are cool too!";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	@RequestMapping("/goodbye")
	public String goodbye() {
		return "Goodbye";
	}
}
