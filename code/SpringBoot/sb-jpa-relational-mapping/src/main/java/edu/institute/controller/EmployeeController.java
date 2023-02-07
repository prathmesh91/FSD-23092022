package edu.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.Employee;
import edu.institute.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/save/emp")
	public String saveEmp(@RequestBody Employee emp) {
		repository.save(emp);
		return "Employee Save Successfully...";
	}
	
	@GetMapping("/get-all/emp")
	public List<Employee> getAllEmp() {
		return repository.findAll();
	}
	
}
