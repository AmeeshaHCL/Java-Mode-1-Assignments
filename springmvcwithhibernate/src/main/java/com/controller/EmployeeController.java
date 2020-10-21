package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.EmployeeDao;
import com.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeDao employeeDao;

	@RequestMapping(value = "/read")
	public String readFunction(@RequestParam("employeeNumber") int val, Model model) {
		Employee obj = employeeDao.readEmployeeById(val);
		model.addAttribute("key1", obj);

		return "success";

	}
}
