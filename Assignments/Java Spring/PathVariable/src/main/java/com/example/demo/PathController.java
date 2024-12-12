package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {
	@RequestMapping("/daikichi/travel/{city}")
	 public String travelFortune(@PathVariable String city) {
		 return "Congratulations! You will soon travel to " + city + "!";
}
	@RequestMapping("/daikichi/lotto/{number}")
	public String num(@PathVariable int number) {
		if( number % 2 == 0) {
			return "you will take a grand journey in the near future but be wary of tempting offers.";
		}else {
			return "you have enjoyed the fruits of your laber , but now is a great time to spend time with family and frinends.";
		}
	}
}