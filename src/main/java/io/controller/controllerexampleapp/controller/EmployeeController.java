package io.controller.controllerexampleapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping ("/details")
	public String EmployeeDetails() {
		return "Hello Employee from EmployeeController Fresh";
	}
}
