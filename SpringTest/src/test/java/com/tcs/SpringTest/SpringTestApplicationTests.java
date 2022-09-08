package com.tcs.SpringTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringTestApplication.class)
public class SpringTestApplicationTests {
	@Autowired
	Animal animal;
	@Test
	public void contextLoads() {
		String sound = animal.getsound().soundable();
		assertEquals("meow",sound);
	}

}
