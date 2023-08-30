package org.jsp.Internship.repositoy;


import org.jsp.Internship.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<Student, Integer> {

	

	Student findByEmail(String email);

	

}
