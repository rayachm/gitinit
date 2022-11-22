package org.cap.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Request1  {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
	}

	
}
