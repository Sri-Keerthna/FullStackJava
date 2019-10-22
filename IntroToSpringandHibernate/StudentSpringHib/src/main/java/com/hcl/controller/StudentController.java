package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@RequestMapping(value="/getAllStudents",method=RequestMethod.GET)
	public String getStudent(Model model){
		return "getStudent";
	}
	
	
}
