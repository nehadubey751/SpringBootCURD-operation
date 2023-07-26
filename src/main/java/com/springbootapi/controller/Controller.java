package com.springbootapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapi.entitiy.Student;
import com.springbootapi.service.StudentService;

@RestController
public class Controller {
	
	@Autowired
	StudentService studentService;
	
	//list of all students should be displayed.
    @GetMapping("/getStudent")
	public List<Student> getStudent()
	{
		return studentService.getStudent();
	}
	
    //Find Student By ID.
    @GetMapping("/getStudentById/{studentId}")
	public Student getStudentById(@PathVariable int studentId)
	{
		return studentService.getStudentById(studentId);
	}
   // Add Student.
    @PostMapping("/addStudent")
	public List<Student> addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
    // update Student
    @PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentService.updateStudent(student);
	}
    //Delete student
    @DeleteMapping("/deleteStudent/{studentId}")
    public Student  deleteStudent(@PathVariable int studentId) {
		return studentService.deleteStudent(studentId);
    	
    }
    
}
