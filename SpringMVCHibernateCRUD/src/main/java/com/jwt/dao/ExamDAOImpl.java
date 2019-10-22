package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Exam;
import com.jwt.model.Student;

@Repository
public class ExamDAOImpl implements ExamDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addMarks(Exam exam) {
		sessionFactory.getCurrentSession().saveOrUpdate(exam);
		
	}

	@SuppressWarnings("unchecked")
	public List<Exam> getAllMarks() {
		return sessionFactory.getCurrentSession().createQuery("from Exam")
				.list();
	}

	@Override
	public void deleteMarks(Integer rollno) {
		Exam exam = (Exam) sessionFactory.getCurrentSession().load(
				Exam.class, rollno);
		if (null != exam) {
			this.sessionFactory.getCurrentSession().delete(exam);
		}	
	}

	@Override
	public Exam updateMarks(Exam rollno) {
		sessionFactory.getCurrentSession().update(rollno);
		return rollno;
	}

	@Override
	public Exam getMarks(int rollno) {
		return (Exam) sessionFactory.getCurrentSession().get(
				Exam.class, rollno);
	}

}
