package com.tcs.springboot.basics.springin5steps;

//import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.tcs.springboot.basics.springin5steps.basic.BinarySearchImp;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		
		//BinarySearchImp binarySearch= new BinarySearchImp(new BubbleSortAlgorithm());
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		BinarySearchImp binarySearch=applicationContext.getBean(BinarySearchImp.class);
		
		BinarySearchImp binarySearch1=applicationContext.getBean(BinarySearchImp.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result= binarySearch.binarySearch(new int[] {12,6,4}, 3);
		
		System.out.println(result);
//		SpringApplication.run(SpringIn5StepsApplication.class, args);
//		System.out.println("Hola");
		((ConfigurableApplicationContext)applicationContext).close();
	}

}
