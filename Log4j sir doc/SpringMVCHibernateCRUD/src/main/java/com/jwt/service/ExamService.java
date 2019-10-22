package com.jwt.service;

import java.util.List;

import com.jwt.model.Exam;

public interface ExamService {
	
	public void addMarks(Exam exam);

	public List<Exam> getAllMarks();

	public void deleteMarks(Integer sid);

	public Exam getMarks(int sid);

	public Exam updateMarks(Exam exam);
}
