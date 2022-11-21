package com.abccollege.teacher;

//import com.abccollege.student.*;
import com.abccollege.student.StudentDetails;
import java.util.Scanner;

public class TeacherDetails {
	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		Scanner scan = new Scanner(System.in);
		
		System.out.println(sd.id);
		System.out.println(sd.name);
		System.out.println(sd.city);
	}
}
