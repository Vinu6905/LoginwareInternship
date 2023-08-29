	package org.jsp.Internship.service;
	
	import java.util.List;
	
	import org.jsp.Internship.entity.Student;
	import org.jsp.Internship.repositoy.studentRepository;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.ui.Model;
	import org.springframework.web.servlet.ModelAndView;
	
	@Service
	public class studentService {
	
		@Autowired
		studentRepository studentRepository;
	
		public void save(Student student) {
			
			studentRepository.save(student);
			
		}
		
		public ModelAndView showstudent(Student student) {
		ModelAndView andView=new ModelAndView("list-students");
		List<Student> list=studentRepository.findAll();
		andView.addObject("students" ,list);
			return andView;
		}
		
		public ModelAndView studentlogin(Student student) {
		    ModelAndView modelAndView = new ModelAndView();
		    String enteredEmail = student.getEmail();
		    String enteredPassword = student.getPassword();
	
		    if (enteredEmail == null || enteredEmail.isEmpty()) {
		        modelAndView.setViewName("student");
		        modelAndView.addObject("msg", "Please register. No account found!");
		    } else {
		        Student storedStudent = studentRepository.findByEmail(enteredEmail);
	
		        if (storedStudent == null) {
		            modelAndView.setViewName("student");
		            modelAndView.addObject("msg", "No account with Entered Email!");
		        } else {
		            if (storedStudent.getPassword().equals(enteredPassword)) {
		            	
		            	if(storedStudent.isEnabled()) {
		            		modelAndView.setViewName("studentpage");
		            		modelAndView.addObject("student" ,storedStudent);
		            	}else {
		            		modelAndView.setViewName("student");
		            		modelAndView.addObject("msg" ,"Admin has not Approved your Account");
		            	}
		              
		            } else {
		                modelAndView.setViewName("student");
		                modelAndView.addObject("msg", "Incorrect password");
		            }
		        }
		    }
		   
		 	return modelAndView;
		}	
	}
	
