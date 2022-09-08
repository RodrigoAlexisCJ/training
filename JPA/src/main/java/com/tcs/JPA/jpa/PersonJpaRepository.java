package com.tcs.JPA.jpa;


import java.util.List;

import javax.persistence.*;
import com.tcs.JPA.entity.Person;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class PersonJpaRepository {
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> findAll(){
		TypedQuery<Person> name= entityManager.createNamedQuery("find_all",Person.class);
		return name.getResultList();
	}
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}
	
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
	
	public void deteById(int id) {
		Person person = this.findById(id);
		entityManager.remove(person);
	}
}
