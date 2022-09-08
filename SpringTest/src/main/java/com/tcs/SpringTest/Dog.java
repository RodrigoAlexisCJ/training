package com.tcs.SpringTest;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Dog")
public class Dog implements Sound{

	@Override
	public String soundable() {
		return "wuau";
		
	}

}
