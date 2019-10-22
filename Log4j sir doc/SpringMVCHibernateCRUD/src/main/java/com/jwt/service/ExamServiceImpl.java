package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ExamDAO;
import com.jwt.model.Exam;

@Service
@Transactional
public class ExamServiceImpl implements ExamService{

	@Autowired
	private ExamDAO examDAO;

	@Override
	@Transactional
	public void addMarks(Exam exam) {
		examDAO.addMarks(exam);
		
	}

	@Override
	@Transactional
	public List<Exam> getAllMarks() {
		return examDAO.getAllMarks();
	}

	@Override
	@Transactional
	public void deleteMarks(Integer rollno) {
		examDAO.deleteMarks(rollno);
		
	}

	@Override
	public Exam getMarks(int rollno) {
		return examDAO.getMarks(rollno);
	}

	@Override
	public Exam updateMarks(Exam rollno) {
		return examDAO.updateMarks(rollno);
	}
	
	public void setexamDAO(ExamDAO examDAO) {
		this.examDAO = examDAO;
	}


}
