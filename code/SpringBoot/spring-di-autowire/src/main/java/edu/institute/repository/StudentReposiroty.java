package edu.institute.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentReposiroty {

	public void save() {
		System.out.println("The save methods from Repository...");
	}
}
