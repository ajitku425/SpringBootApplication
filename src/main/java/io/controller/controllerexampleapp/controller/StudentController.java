package io.controller.controllerexampleapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.controller.controllerexampleapp.service.StudentService;

@RestController
@RequestMapping (value="StudentController")
public class StudentController {
	
	@Autowired
	private StudentService studentService; 
	
	
	@RequestMapping (value="/details")
	public String StudentDetails() {
		System.out.println("This is StudentController classess");
		return "Hello Student from StudentController Fresh";
	}
}
