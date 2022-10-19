package com.tcs.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class UserDAOService {
private static List<User> users = new ArrayList<>();
private static int userCount = 0;
static {
	users.add(new User(++userCount,"Pashu",LocalDate.now().minusYears(30)));
	users.add(new User(++userCount,"Eve",LocalDate.now().minusYears(20)));
	users.add(new User(++userCount,"Adam",LocalDate.now().minusYears(38)));
}
public List<User> getAll(){
	return users;
}

public User save(User user) {
	user.setId(++userCount);
	users.add(user);
	return user;
}
public User findOneUser(int id) {
	Predicate<? super User> predicated = user->user.getId()==id;
	return users.stream().filter(predicated).findFirst().orElse(null);
}

public void deleteById(int id) {
	Predicate<? super User> predicated = user->user.getId()==id;
	users.removeIf(predicated);
}
}
