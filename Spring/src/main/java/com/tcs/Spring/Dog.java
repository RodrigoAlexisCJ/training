package com.tcs.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Dog")
public class Dog implements Sound{

	@Override
	public void soundable() {
		System.out.println("wuau");// TODO Auto-generated method stub
		
	}

}
