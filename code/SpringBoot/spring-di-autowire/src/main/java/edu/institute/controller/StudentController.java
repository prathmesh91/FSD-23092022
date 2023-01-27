package edu.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.institute.service.StudentService;

@Component
public class StudentController {

	@Autowired
	StudentService service;
	
	public void saveStudent() {
		System.out.println("The saveStudent methods from Controller...");
		service.saveStudent();
	}
	
}
