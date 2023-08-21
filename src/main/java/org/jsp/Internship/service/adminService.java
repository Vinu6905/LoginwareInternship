package org.jsp.Internship.service;

import org.jsp.Internship.helper.Login;
import org.jsp.Internship.repositoy.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class adminService {

	@Autowired
	Login login;
	
	@Autowired
	studentRepository repository;
	
	public ModelAndView loadAdmin(Login login) {
		ModelAndView view=new ModelAndView();
		if(login.getName().equals("admin")) {
			if(login.getPassword().equals("admin")) {
				view.setViewName("Adminuuu");
				
			}else {
				view.setViewName("AdminHome");
				view.addObject("msg" ,"enter the correct password");
			}
		}
			else {
				view.setViewName("AdminHome");
				view.addObject("msg" ,"enter the correct name");
			}
			
		return view;
	}
	public void deletbyId(int sid) {
	repository.deleteById(sid);
 	
	}
		
	}


	




