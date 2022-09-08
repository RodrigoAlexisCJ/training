package com.tcs.Spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class Application {
	private static Logger LOGGER = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
		
		Animal animal1 = applicationContext.getBean(Animal.class);
		Animal animal2 = applicationContext.getBean(Animal.class);
		
		LOGGER.info("{}",animal1);
		LOGGER.info("{}",animal1.getsound());
		LOGGER.info("{}",animal2);
		LOGGER.info("{}",animal1.getsound());
		
		animal1.getsound().soundable();
		
		((ConfigurableApplicationContext)applicationContext).close();
	}

}
