package com.eureka.cntroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/info")
	public String getHome()
	{
		return "Welcome from Eureka Client";
	}

}
