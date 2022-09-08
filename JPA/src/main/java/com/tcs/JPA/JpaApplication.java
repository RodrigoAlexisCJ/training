package com.tcs.JPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.JPA.entity.Person;
//import com.tcs.JPA.jpa.PersonJpaRepository;
import com.tcs.JPA.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@Autowired
//	PersonJpaRepository repository;
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("User no 1 -> {}",repository.findById(1));
		
		LOGGER.info("Insert value -> {}",repository.save(new Person("Pedro","Chihuahua")));
		
//		LOGGER.info("Insert value -> {}",repository.insert(new Person("Pedro","Chihuahua")));
		
		repository.deleteById(2);
//		repository.deteById(2);
		
		LOGGER.info("Insert value -> {}",repository.findAll());
		
	}

}
