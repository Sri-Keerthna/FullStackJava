package com.jwt.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Exam;
import com.jwt.service.ExamService;

@Controller("/exam")
public class ExamController {


	private static final Logger logger = Logger
			.getLogger(ExamController.class);

	public ExamController() {
		System.out.println("ExamController()");
	}

	@Autowired
	private ExamService ExamService;

	@RequestMapping(value = "/Marks")
	public ModelAndView listMarks(ModelAndView model) throws IOException {
		List<Exam> listMarks = ExamService.getAllMarks();
		model.addObject("listMarks", listMarks);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newExam", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Exam exam = new Exam();
		model.addObject("exam", exam);
		model.setViewName("ExamForm");
		return model;
	}

	@RequestMapping(value = "/saveExam", method = RequestMethod.POST)
	public ModelAndView saveMarks(@ModelAttribute Exam exam) {
		if (exam.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			ExamService.addMarks(exam);
		} else {
			ExamService.updateMarks(exam);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteExam", method = RequestMethod.GET)
	public ModelAndView deleteMarks(HttpServletRequest request) {
		int sid = Integer.parseInt(request.getParameter("id"));
		ExamService.deleteMarks(sid);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editExam", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int sid = Integer.parseInt(request.getParameter("id"));
		Exam exam = ExamService.getMarks(sid);
		ModelAndView model = new ModelAndView("ExamForm");
		model.addObject("exam", exam);

		return model;
	}
}
