package com.tcs.Hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner{
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private HospitalService service;
	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.updateHospital(new Hospital(102,"pashu","Chicago"));
		LOGGER.info("{}",service.getAllHospitals());// TODO Auto-generated method stub
		LOGGER.info("{}",service.getHospital(102));
		
	}

}
