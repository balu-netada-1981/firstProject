package com.microsoft.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.microsoft.repository.EmployeeRepository;
import com.microsoft.entity.EmployeeDetailsEntity;

@Controller
public class EmployeeController {
@Autowired
	private EmployeeRepository employeerepo;
 
	
	@GetMapping("/employee")
	public ModelAndView getEmployeeDetails(EmployeeDetailsEntity employeeDetail) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("emp", employeeDetail);
		mav.setViewName("index");
		return mav;
		
	}
	@PostMapping("/employee")
	public ModelAndView setEmployeeDetails(EmployeeDetailsEntity employeeDetail) {
		EmployeeDetailsEntity save = employeerepo.save( employeeDetail);
		ModelAndView mav=new ModelAndView();
		mav.addObject("submit", "data saved successfully...!");
		mav.setViewName("submitbutton");
		
		return mav;
		
	}
	@GetMapping("/details")
	public ModelAndView getDatabaseDetais(EmployeeDetailsEntity employeeDetail) {
		List<EmployeeDetailsEntity> all = employeerepo.findAll();
		ModelAndView mav=new ModelAndView();
		mav.addObject("form", all);
		mav.setViewName("details");
		
		return mav;

	}
//	@GetMapping("/single")
//	public ModelAndView getSingleData(@RequestParam String employeeName) {
//		ModelAndView mav = new ModelAndView();
//		  Optional<EmployeeDetailsEntity> employee = employeerepo.findByName(employeeName);
//		  if(employee.isPresent()) {
//			  mav.addObject("employee",employee.get());
//			  
//		  }else {
//			  mav.addObject("message","Employee not found");
//		  }
//		  mav.setViewName("single");
//		return mav;
//	}

}
