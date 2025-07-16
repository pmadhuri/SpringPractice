package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
public class StudentController {
private static Logger logger=LoggerFactory.getLogger(StudentController.class);

	public StudentController() {
		super();
		logger.info("started Student Controller Called ");
		System.out.println("Student Controller Called.");
		
	}

}
