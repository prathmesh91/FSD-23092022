package edu.institute.comtroller;

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
import edu.institute.serivce.StudentService;
 
@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;

	@PostMapping("/student/save")
	public String saveStudent(@RequestBody Student st) {
		service.addStudent(st);
		return "Student Created Successfully";
	}
	
	@GetMapping("/student/get-all")
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}
	
	@DeleteMapping("/student/delete")
	public String deleteStudent(@RequestParam("id") int id) {
		boolean flag = service.deleteStudent(id);
		return flag? "Student Deleted Successfully..." : "Student Deletion Fail...";
	}
	
	@PutMapping("/student/update")
	public String updateStudent(@RequestBody Student st) {
		boolean flag = service.updateStudent(st);
		return flag? "Student Updated Successfully..." : "Student Updation Fail...";
	}
}
