package com.tcs.Mockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MockitoApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext applicationContext= 
		SpringApplication.run(MockitoApplication.class, args))
		{
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

}
