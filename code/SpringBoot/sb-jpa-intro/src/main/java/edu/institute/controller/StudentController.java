package edu.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.bean.Student;
import edu.institute.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/student/save")
	public String saveStudent(@RequestBody Student stud) {
		repo.save(stud);
		return "Student Save Successfully";
	}
	
	@GetMapping("student/get-all")
	public List<Student> getAllStudent() {
		return repo.findAll();
	}
	
	@PutMapping("/student/update")
	public String updateStudent(@RequestBody Student stud) {
		repo.save(stud);
		return "Student Updated Successfully";
	}
	
	@DeleteMapping("/student/delete")
	public String deleteStudent(@RequestParam int id) {
		repo.deleteById(id);
		return "Student Deleted Successfully";
	}
	
}
