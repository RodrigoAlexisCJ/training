package com.tcs.springboot.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;

//import com.tcs.springboot.basics.springin5steps.basic.BinarySearchImp;
import com.tcs.springboot.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	public static void main(String[] args) {
		
		//BinarySearchImp binarySearch= new BinarySearchImp(new BubbleSortAlgorithm());
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDAO personDAO=applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO1=applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());
		
//		System.out.println(personDAO);
//		System.out.println(personDAO1);
		
		//int result= binarySearch.binarySearch(new int[] {12,6,4}, 3);
		
//		System.out.println(result);
//		SpringApplication.run(SpringIn5StepsApplication.class, args);
//		System.out.println("Hola");
	}

}
