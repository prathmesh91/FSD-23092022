package eud.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import eud.institute.bean.StudentDetails;

@SpringBootApplication
public class SbIocDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SbIocDiApplication.class, args);
		
		StudentDetails st = context.getBean(StudentDetails.class);
		st.printMsg();
	}

}
