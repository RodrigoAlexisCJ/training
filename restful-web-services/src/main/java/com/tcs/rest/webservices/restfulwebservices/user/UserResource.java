package com.tcs.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
//@Autowired
private UserDAOService service;

public UserResource(UserDAOService service) {
	this.service = service;
}

@RequestMapping(value="/users",method=RequestMethod.GET)
public List<User> retrieveAllUsers(){
	return service.getAll();
}
@RequestMapping(value="/users/{id}",method=RequestMethod.GET)
public User retrieveUser(@PathVariable int id){
	User user=service.findOneUser(id);
	if(user==null) {
		throw new UserNotFoundException("id "+id);
	}
	return user;
}

@RequestMapping(value="/users/{id}",method=RequestMethod.DELETE)
public void deletUser(@PathVariable int id){
	service.deleteById(id);
}

@RequestMapping(value="/users",method=RequestMethod.POST)
public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
	User savedUser = service.save(user);
	URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedUser.getId())
			.toUri();
	return ResponseEntity.created(location).build();
}

}
