package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.StudentDAO;
import com.hcl.model.Student;

public class StudentServiceImpl implements StudentService {

		@Autowired
		private StudentDAO studentDAO;

		@Override
		@Transactional
		public void addStudent(Student student) {
			studentDAO.addStudent(student);
			
		}

		@Override
		@Transactional
		public List<Student> getAllStudents() {
			return studentDAO.getAllStudents();
		}

		@Override
		@Transactional
		public void deleteStudent(Integer rollno) {
			studentDAO.deleteStudent(rollno);
		}

		public Student getStudent(int rollno) {
			return studentDAO.getStudent(rollno);
		}

		public Student updateStudent(Student student) {
			return studentDAO.updateStudent(student);
		}
		
}
