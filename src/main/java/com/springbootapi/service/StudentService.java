package com.springbootapi.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.springbootapi.entitiy.Student;

public interface StudentService {
	public List<Student> getStudent();
	
	public Student getStudentById(int Id);
	
	public List<Student> addStudent(Student student);

	public Student updateStudent(Student student);

	public Student deleteStudent(int studentId);

	

}

