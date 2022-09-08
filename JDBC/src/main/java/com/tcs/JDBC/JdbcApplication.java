package com.tcs.JDBC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.JDBC.DAO.PersonJdbcDAO;
import com.tcs.JDBC.entity.Person;

@SpringBootApplication
public class JdbcApplication implements CommandLineRunner{

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDAO dao;
	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("All users -> {}",dao.findAll());
		
		LOGGER.info("Users no 2 -> {}",dao.findById(2));
		
		LOGGER.info("Adding new user -> num of rows added {}",dao.insertRow(new Person("Pablo","Chihuahua")));
		
		LOGGER.info("Deleting no 3 -> num of rows deleted {}",dao.deleteById(3));
		
		LOGGER.info("All users -> {}",dao.findAll());
		
		LOGGER.info("Update user 4 -> num of rows added {}",dao.updateRow(new Person("Pedro","Sinaloa"),4));
		
		LOGGER.info("Users no 4 -> {}",dao.findById(4));
	}

}
