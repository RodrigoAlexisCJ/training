package com.tcs.springboot.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.tcs.springboot.basics.Component.ComponentPersonDAO;
//import com.tcs.springboot.basics.springin5steps.basic.BinarySearchImp;

@SpringBootApplication
 @ComponentScan("com.tcs.springboot.basics.Component")
public class SpringIn5StepsComponentApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);
	public static void main(String[] args) {
		
		//BinarySearchImp binarySearch= new BinarySearchImp(new BubbleSortAlgorithm());
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentApplication.class, args);
		
		ComponentPersonDAO personDAO=applicationContext.getBean(ComponentPersonDAO.class);
		ComponentPersonDAO personDAO1=applicationContext.getBean(ComponentPersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getComponentJdbcConnection());
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getComponentJdbcConnection());
//		SpringApplication.run(SpringIn5StepsApplication.class, args);
//		System.out.println("Hola");
		((ConfigurableApplicationContext)applicationContext).close();
	}

}
