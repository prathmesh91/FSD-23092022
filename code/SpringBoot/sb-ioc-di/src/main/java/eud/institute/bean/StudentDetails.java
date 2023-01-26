package eud.institute.bean;

import org.springframework.stereotype.Component;

@Component
public class StudentDetails {
	public StudentDetails() {
		System.out.println("Student Details Created");
	}
	
	public void printMsg() {
		System.out.println("THis is the print method from the StudentDetails class...");
	}
}
