package in.sp.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.beans.Student;

@Configuration
public class AppConfig {
	
	@Bean//Adding this bean is necessary to know spring to work
	public CommandLineRunner cmdLineRunner() {//so we called commanlinerunenr and return it here in new configuration
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				stdBean1().display();
				
				System.out.println("....................................");
				
				
				stdBean2().display();
			}
		};	}
	
	@Bean//this will return student bean object
	public Student stdBean1() {//to return student bean
		return new Student("Abhijeet", 101, 95);
	}
	
    
   
    
    @Bean//second bean method
   	public Student stdBean2() {//to return student bean
   		return new Student("Vijay", 102, 67);
   	}
	
	
}
