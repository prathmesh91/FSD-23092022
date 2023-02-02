package edu.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // to create the REST APIs
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcomeAPI() {
		return "Welcome To First REST API in Spring Boot";
	}
	
	// http://localhost:8080/hello-msg?name=Xyz
	@GetMapping("/hello-msg")
	public String sayHello(@RequestParam("name") String name) {
		return "Hello User, "+name;
	}
	
	// http://localhost:8080/calculator?n1=12.3&n2=13.3&opt=Add
	@GetMapping("/calculator")
	public String calculation(@RequestParam("n1") double num1, 
								@RequestParam("n2")double num2, 
								@RequestParam("opt")String operation) {
		double ans = 0;
		String symbol="";
		switch(operation) {
		case "Add":
			symbol="+";
			ans = num1 + num2;
			break;
		case "Sub":
			symbol="-";
			ans = num1 - num2;
			break;
		case "Mul":
			symbol="*";
			ans = num1 * num2;
			break;
		case "Div":
			symbol="/";
			ans = num1 / num2;
			break;
		}
		
		return num1 + symbol + num2 + " = " + ans;
	}
	
}
