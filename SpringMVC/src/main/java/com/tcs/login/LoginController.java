package com.tcs.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	@RequestMapping(value="/login",method=RequestMethod.GET)
//	@ResponseBody
	public String showLoginPage() {
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
//	@ResponseBody
	public String showLoginRequest(@RequestParam String name, @RequestParam String pass, ModelMap model) {
		if(service.isUserValid(name, pass)) {
			model.put("name", name);
			model.put("pass", pass);
//			System.out.println(name);
			return "welcome";
		}
		else {
			model.put("error", "Invalid User or Password");
			return "login";
		}
		
	}
}
