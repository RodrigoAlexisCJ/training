package com.tcs.JPA.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.JPA.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person,Integer>{

}
