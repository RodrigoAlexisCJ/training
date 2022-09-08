package com.tcs.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Cat")
public class Cat implements Sound{

	@Override
	public void soundable() {
		System.out.println("meow");// TODO Auto-generated method stub
		
	}

}
