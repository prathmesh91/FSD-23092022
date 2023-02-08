package edu.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.Project;
import edu.institute.repository.ProjectRepository;

@RestController
public class ProjectController {

	@Autowired
	private ProjectRepository repository;
	
	@PostMapping("/save/project")
	public String saveProject(@RequestBody Project project) {
		repository.save(project);
		return "Projected added Successfully...";
	}
	
	@GetMapping("/get-all/project")
	public List<Project> getAllProject() {
		return repository.findAll();
	}
	
	@GetMapping("/get-emp/project/{eid}")
	public List<Project> getEmployeeProject(@PathVariable(name="eid") int id) {
		return repository.getEmployeeProject(id);
	}
	
}










