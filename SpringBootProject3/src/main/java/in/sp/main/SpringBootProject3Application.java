package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProject3Application {

	public static void main(String[] args) {
		System.out.println("Spring Boot Web App Started");
		SpringApplication.run(SpringBootProject3Application.class, args);
		
		System.out.println("Spring Boot Web App Finished");
	}

}
