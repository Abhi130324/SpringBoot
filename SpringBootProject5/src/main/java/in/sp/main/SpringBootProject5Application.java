
package in.sp.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProject5Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {//we create bean object of this class
		
		myClass().printMessage("Abhijeet");
		
		
		
	}
	
	@Bean
	public MyClass myClass() {
		return new MyClass();
				
	}
}













//Other way but not recommened because it is hard coding



//package in.sp.main;
//
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//
//@SpringBootApplication
//public class SpringBootProject5Application  {
//
//	public static void main(String[] args) {
//    ApplicationContext context = SpringApplication.run(SpringBootProject5Application.class, args);
//    MyClass m =  context.getBean(MyClass.class);//return value in my class
//    m.printMessage("Abhijeet");
//    
//	}
//
//	
//	
//	
//
//}
