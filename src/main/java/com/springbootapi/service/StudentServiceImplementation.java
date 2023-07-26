package com.springbootapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springbootapi.entitiy.Student;

@Service
public class StudentServiceImplementation implements StudentService{
       List<Student> list=null;
	
       StudentServiceImplementation()
	{
		list=new ArrayList<>();
		list.add(new Student(11,"Neha","Dubey","29/10/1998",80));
		list.add(new Student(12,"Pallu","Kakde","01/06/1998",90));
		list.add(new Student(13,"Nisha","Vade","22/11/1998",50));
		list.add(new Student(14,"Priya","Jane","14/04/1998",70));
		list.add(new Student(15,"Manisha","Patil","15/07/1998",70));
		
   }
   @Override
	public List<Student> getStudent() {
		return list;
	}
   
   @Override
	public Student getStudentById(int id) {
	   Student s=null;
		
		for(Student stud:list)
		{
			if(stud.getStudentId()==id)
			{
				s=stud;
				break;
			}
		}
		return s;
	}
   @Override
	public List<Student> addStudent(Student student) {
		list.add(student);
		return list;
	}
   @Override
	public Student updateStudent(Student student) {
	
		for(Student stu:list)
		{
			if(stu.getStudentId()==student.getStudentId())
			{
				stu.setFirstname(student.getFirstname());
				stu.setLastname(student.getLastname());
				stu.setDOB(student.getDOB());
				stu.setMarks(student.getMarks());
				
			}
		}
	return student;
	}
   @Override
   public Student deleteStudent(int id) {
	list=list.stream().filter(Student ->Student.getId()!=id).collect(Collectors.toList());
	return deleteStudent(id);
	
	
	 }
	
}
