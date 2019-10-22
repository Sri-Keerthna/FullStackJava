package com.sri;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {

	int numOfPages;
	int numRecords=2;
	@Autowired
	private EmployeeRepository dao;

	@RequestMapping(value = "/")
	public ModelAndView getEmployees(ModelAndView model) throws IOException {
		ModelAndView mv=new ModelAndView();
		List<Employee> employeeList=(List<Employee>) dao.findAll();
		numOfPages=employeeList.size()/numRecords+employeeList.size()%numRecords;
		mv.addObject("pages",numOfPages);
		mv.addObject("employeeList", employeeList);
		mv.addObject("totalrecords",employeeList.size());
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/displayjavacontractors")
	public ModelAndView getDeptandDesig(ModelAndView model) throws IOException {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", dao.findByDeptAndDesig("java", "developer"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/displayjavaEmployees")
	public ModelAndView getProgrammer(ModelAndView model) throws IOException {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", dao.findByDeptAndDesig("dotnet", "programmer"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/displayjavaEngineers")
	public ModelAndView getjavaSE(ModelAndView model) throws IOException {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", dao.findByDeptAndDesig("CSE", "SE"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/displaymoreBasic")
	public ModelAndView getmoreBasic(ModelAndView model) throws IOException {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", dao.findByBasic("CSE", "SE",5000));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/displaylessBasic")
	public ModelAndView getlessBasic(ModelAndView model) throws IOException {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", dao.findByBasicandName("CSE", "SE",50000));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/displayAllSortByDesig")
	public ModelAndView displayAllSortByDesig() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", dao.findAll(Sort.by("desig")));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/displayAllSortByDesigDesc")
	public ModelAndView displayAllSortByDesigDesc() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", dao.findAll(Sort.by("desig").descending()));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/dispalyAllBasicandDeptinDesc")
	public ModelAndView dispalyAllBasicandDeptinDesc() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", dao.findAll(Sort.by("dept","basic").descending()));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/displaydeveloperwithbasicdesc")
	public ModelAndView displaydeveloperwithbasicdesc() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", dao.findBydeptanddesigwithdescbasic("java","developer"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/displayprgmmer")
	public ModelAndView dispalyprogrammer() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", dao.findByprgmer("java","developer",90000));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/displayAll/Page/{pageno}")
	public ModelAndView dispalyAllSortByDesig(@PathVariable("pageno")int pageno) {
		ModelAndView mv=new ModelAndView();
		Page<Employee> pages=dao.findAll(PageRequest.of(pageno, numRecords));
		mv.addObject("pages",numOfPages);
		mv.addObject("employeeList",(pages).getContent());
		mv.setViewName("home");
		return mv;
	}
	
}
