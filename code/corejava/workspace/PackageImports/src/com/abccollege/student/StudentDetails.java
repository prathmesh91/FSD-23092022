package com.abccollege.student;

public class StudentDetails {
	public int id;
	public String name;
	String dob;
	public String city;
	
	public void print() {
		System.out.println("id : "+id );
	}
}

class StudentAttendance extends StudentDetails{
	public void getStudent() {
		StudentDetails sd = new StudentDetails();
		System.out.println(sd.id);
		System.out.println(id);
		System.out.println(dob);
	}
}
