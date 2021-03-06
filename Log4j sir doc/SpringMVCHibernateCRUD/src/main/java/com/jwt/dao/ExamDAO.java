package com.jwt.dao;

import java.util.List;

import com.jwt.model.Exam;

public interface ExamDAO {
	public void addMarks(Exam exam);

	public List<Exam> getAllMarks();

	public void deleteMarks(Integer rollno);

	public Exam updateMarks(Exam rollno);

	public Exam getMarks(int rollno);
}
