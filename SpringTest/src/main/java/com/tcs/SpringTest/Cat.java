package com.tcs.SpringTest;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Cat")
public class Cat implements Sound{

	@Override
	public String soundable() {
		return "meow";
		
	}

}
