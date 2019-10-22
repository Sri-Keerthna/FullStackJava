package com.sri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class ClientController {

	@Autowired
	ClientUserService clientUserService;
	
	@RequestMapping("/home")
	public ModelAndView home(ModelAndView model) {
		model.addObject("user",new User());
		model.setViewName("login");
		return model;
		
	}
	
}
