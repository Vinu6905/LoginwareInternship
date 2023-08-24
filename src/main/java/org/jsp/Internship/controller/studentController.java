package org.jsp.Internship.controller;

import org.jsp.Internship.entity.Student;
import org.jsp.Internship.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class studentController {

	@Autowired
	studentService  service;
	
	@GetMapping("/student")
	public String student() {
		return "student";
	}

	@PostMapping("/save")
	public String addstudent(@ModelAttribute Student student) {
		service.save(student);
		return "redirect:/";
	}
	
	@GetMapping("/showstudents")
	public ModelAndView showstudent(@ModelAttribute Student  student) {
		return service.showstudent(student);
	}
	
	@RequestMapping("/studentlogin")
	public ModelAndView studentlogin(@ModelAttribute Student student) {
	return service.studentlogin(student);
	}
}
	

