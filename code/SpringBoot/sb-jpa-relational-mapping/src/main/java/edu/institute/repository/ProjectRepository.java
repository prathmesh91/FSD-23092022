package edu.institute.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.institute.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
	
	@Query(value = "SELECT p from Project p WHERE emp.eid= :id")
	//@Query(value = "select * from Project_details where eid= :id", nativeQuery = true)
	public List<Project> getEmployeeProject(@Param("id") int id);
	
}
