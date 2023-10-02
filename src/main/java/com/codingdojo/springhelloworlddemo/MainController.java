package com.codingdojo.springhelloworlddemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/search")
	public String index2(@RequestParam(value="q", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "You searched for nothing";
		}
		return "You searched for: " + searchQuery;
	}
	@RequestMapping("/test")
	public String test() {
		return "<h1 style='color:red;'> Hello World </h1>";
	}
}
