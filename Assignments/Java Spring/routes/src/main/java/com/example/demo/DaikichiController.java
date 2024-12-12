package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String route() {
		return "welcome";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "'Today you will find luck in all your endeavors!'.";
	}
	
	@RequestMapping("/tommorrow")
	public String tommorrow() {
		return new String( "'Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'.");
	}
	
	

}
