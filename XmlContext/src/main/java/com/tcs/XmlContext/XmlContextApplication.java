package com.tcs.XmlContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Configuration
//@ComponentScan
public class XmlContextApplication {
	public static Logger LOGGER = LoggerFactory.getLogger(XmlContextApplication.class);
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXmlJdbcConnection());
			LOGGER.info("Beans Loaded --> {}",(Object)applicationContext.getBeanDefinitionNames());
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

}
