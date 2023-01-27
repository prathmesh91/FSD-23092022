package edu.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import edu.institute.controller.StudentController;
import edu.institute.util.DBConnection;

@SpringBootApplication
public class SpringDiAutowireApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiAutowireApplication.class, args);
		StudentController controller = ctx.getBean(StudentController.class);
		controller.saveStudent();
		
		DBConnection db = ctx.getBean("dbcon", DBConnection.class);
		db.getConnection();
		
		
	}
	
	@Bean("dbcon")
	public DBConnection DbCOnnectionObject() {
		DBConnection db = new DBConnection("URL","UserName","Password");
		return db;
	}

}
