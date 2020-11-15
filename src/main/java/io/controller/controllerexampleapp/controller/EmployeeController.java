package io.controller.controllerexampleapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping ("/details")
	public String EmployeeDetails() {
		System.out.println("This is EmployeeController classess");
		return "Hello Employee updated in GIT";
	}
}
