package com.tcs.SpringTest;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SpringTestApplication {
//	private static Logger LOGGER = LoggerFactory(SpringTestApplication.class);
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringTestApplication.class)){
			Animal animal1 = applicationContext.getBean(Animal.class);
//			Animal animal2 = applicationContext.getBean(Animal.class);
			
//			LOGGER.info("{}",animal1);
//			LOGGER.info("{}",animal1.getsound());
//			LOGGER.info("{}",animal2);
//			LOGGER.info("{}",animal1.getsound());
//			
			System.out.println(animal1.getsound().soundable());
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		
	}

}
