package edu.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.institute.repository.StudentReposiroty;

@Service
public class StudentService {

	@Autowired
	StudentReposiroty repository;
	
	public void saveStudent() {
		System.out.println("The SaveStudent methods from Service...");
		repository.save();
	}
	
}
