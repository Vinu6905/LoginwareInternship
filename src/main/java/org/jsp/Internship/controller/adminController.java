package org.jsp.Internship.controller;

import org.jsp.Internship.helper.Login;
import org.jsp.Internship.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping()
public class adminController {

	@Autowired
	adminService service;
	
	@GetMapping("/admin")
	public String admin() {
		return "Adminhome";
	}
	
	@RequestMapping("/adminlogin")
	public ModelAndView loadAdmin(@ModelAttribute Login login) {
		return service.loadAdmin(login);
	}
	
	@RequestMapping("/deletbyid/{sid}")
	public String deletbyId(@PathVariable int sid) {
		service.deletbyId(sid);
	    return "list-students";
	}
	
	
	
}
