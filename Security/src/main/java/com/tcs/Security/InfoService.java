package com.tcs.Security;

import org.springframework.stereotype.Service;
@Service
public class InfoService implements IInfoService {
	@Override
	public String getMsg() {
		return "Hello ";
	}
} 
