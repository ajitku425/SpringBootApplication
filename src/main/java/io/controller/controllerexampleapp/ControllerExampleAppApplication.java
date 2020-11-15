package io.controller.controllerexampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class ControllerExampleAppApplication extends SpringBootServletInitializer {
	
	
	  @Override protected SpringApplicationBuilder
	  configure(SpringApplicationBuilder application) { return
	  application.sources(ControllerExampleAppApplication.class); }
	 

	public static void main(String[] args) {
		SpringApplication.run(ControllerExampleAppApplication.class, args);
	}

}
