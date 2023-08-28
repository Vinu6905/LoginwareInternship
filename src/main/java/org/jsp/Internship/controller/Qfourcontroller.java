package org.jsp.Internship.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Qfourcontroller {

	@GetMapping("/qfour")
	public String qfour() {
		return "qfour";
	}
	
	@GetMapping("/qfourembedded")
	public String embedded() {
		return"qfourembedded";
	}
	
	@GetMapping("/placed")
	public String placed() {
		return "placed";
	}
	
	
	@GetMapping("/model")
	public String model() {
		return "model";
	}
	
}
