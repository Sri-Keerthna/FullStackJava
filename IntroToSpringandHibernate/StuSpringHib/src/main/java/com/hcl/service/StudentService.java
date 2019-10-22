package com.hcl.service;

import java.util.List;

import com.hcl.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);

	public List<Student> getAllStudents();

	public void deleteStudent(Integer rollno);

	public Student getStudent(int rollno);

	public Student updateStudent(Student student);
}
