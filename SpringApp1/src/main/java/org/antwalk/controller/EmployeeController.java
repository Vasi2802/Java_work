package org.antwalk.controller;

import java.util.ArrayList;
import java.util.List;

import org.antwalk.entity.Employee;
import org.antwalk.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empres;
	
	
	@GetMapping("/home")
	public ModelAndView enterDetails() {
		ModelAndView m = new ModelAndView("insert");
		Employee employee = new Employee();
		m.addObject("employee",employee);
		return m;
	}
	
	@PostMapping("/show")
	public ModelAndView showDetails(@ModelAttribute Employee customer) {
		ModelAndView mv = new ModelAndView("show");
		empres.create(customer);
		List<Employee> e = new ArrayList<Employee>();
		e = empres.read();
		mv.addObject("customer",e);
		return mv;
	}
	
	

}
