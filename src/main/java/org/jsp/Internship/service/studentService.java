package org.jsp.Internship.service;

import org.jsp.Internship.entity.Student;
import org.jsp.Internship.repositoy.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {

	@Autowired
	studentRepository studentRepository;

	public void save(Student student) {
		studentRepository.save(student);
		
	}
	
	
}
