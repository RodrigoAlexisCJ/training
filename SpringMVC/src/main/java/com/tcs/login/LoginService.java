package com.tcs.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean isUserValid(String user,String password) {
		if(user.equals("pashu")&& password.equals("123")) {
			return true;
		}
		return false;
	}
}
