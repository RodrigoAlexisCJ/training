package com.tcs.jpawithMysql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaWithMysqlApplication implements CommandLineRunner{
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaWithMysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		LOGGER.info("Insert value -> {}",repository.save(new Employee("Pedro","Develop",1422)));
		LOGGER.info("{}",repository.findAll());// TODO Auto-generated method stub
//		repository.deleteById(6);
//		LOGGER.info("{}",repository.findAll());// TODO Auto-generated method stub
	}

}
