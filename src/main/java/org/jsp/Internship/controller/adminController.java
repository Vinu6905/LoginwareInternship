package org.jsp.Internship.controller;

import java.util.List;

import org.jsp.Internship.entity.Student;
import org.jsp.Internship.helper.Login;
import org.jsp.Internship.repositoy.studentRepository;
import org.jsp.Internship.service.adminService;
import org.jsp.Internship.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@Autowired
	studentRepository repository;
	
	@GetMapping("/admin")
	public String admin() {
		return "Adminhome";
	}
	
	@RequestMapping("/adminlogin")
	public ModelAndView loadAdmin(@ModelAttribute Login login) {
		return service.loadAdmin(login);
	}
	
	@GetMapping("/deletbyid/{sid}")
	public ModelAndView deletbyId(@PathVariable int sid) {
		ModelAndView andView=service.deletbyId(sid);
		return andView;
	    
	}	

	@GetMapping("/list-students")
	public 	ModelAndView liststudents() {
		ModelAndView andView= new ModelAndView("list-students");
		List<Student> list=repository.findAll();
		andView.addObject("students" ,list);
		return andView;
	
	}
	@GetMapping("/Adminuuu")
	public String Adminuuu() {
		return "Adminuuu";
	}


	
}
