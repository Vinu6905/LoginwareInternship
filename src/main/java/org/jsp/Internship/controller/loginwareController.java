package org.jsp.Internship.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginwareController {

	@GetMapping("/")
	public String loginware() {
		return "mainhome";
	}
	@GetMapping("/mainhome")
	public String mainhome() {
		return "mainhome";
	}
	@GetMapping("/home1")
	public String home() {
		return "home1";
	}
	@GetMapping("/student_register")
	public String studentregister() {
	return "newRegister1";
	}
	
	
	@GetMapping("/python")
	public String python() {
		return "python";
	}
	@GetMapping("/ai")
	public String ai() {
		return "ai";
	}
	
	@GetMapping("/c")
	public String embeddedc() {
		return "c";
	}
	
	@GetMapping("/cloud")
	public String cloud() {
		return "cloud";
	}
	@GetMapping("/iot")
	public String iot() {
		return "iot";
	}
	
	@GetMapping("/eagle")
	public String eagle() {
		return "eagle";
	}
	
	@GetMapping("/eaglepro")
	public String eaglepro() {
		return "eaglepro";
	}
	
	@GetMapping("/sparrow")
	public String sparrow() {
		return "sparrow";
	}
	
	@GetMapping("/feathergauge")
	public String feathergauge() {
		return "feathergauge";
	}
	
	@GetMapping("/featherwatt")
	public String featherwatt() {
		return "featherwatt";
	}
	
	@GetMapping("/vision")
	public String vision() {
		return "vision";
	}
	
	@GetMapping("/aboutus")
	public String aboutus() {
		return "aboutus";
	}
	@GetMapping("/contactus")
	public String contactus() {
		return "contactus";
	}
}
