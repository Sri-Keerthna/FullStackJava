package com.sri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ClientController {

	@Autowired
	ClientUserService clientUserService;
	
	@Autowired
	protected RestTemplate restTemplate;
	
	@RequestMapping("/home")
	public ModelAndView home(ModelAndView model) {
		model.addObject("user",new User());
		model.setViewName("login");
		return model;	
		
	}
	
	@RequestMapping("/authentication")
	public ModelAndView loginauthentication(@ModelAttribute User user) {
		int login=clientUserService.login(user);
		if(login==0) {
			return new ModelAndView("/NewAccount");
		}else {
		return new ModelAndView("/home");
		}
	}
	
	
}
