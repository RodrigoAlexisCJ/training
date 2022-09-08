package com.tcs.JDBC.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tcs.JDBC.entity.Person;

@Repository
public class PersonJdbcDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Person> findAll(){
		return jdbcTemplate.query("SELECT * FROM PERSON",
				new BeanPropertyRowMapper<Person>(Person.class) );
	}
	@SuppressWarnings("deprecation")
	public Person findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM PERSON WHERE ID =?", new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class) );
	}
	
	public int deleteById(int id) {
		return jdbcTemplate.update("DELETE FROM PERSON WHERE ID =?", new Object[] {id});
	}
	
	public int insertRow(Person person) {
		return jdbcTemplate.update("insert into person (name, location ) values (?,?) ", new Object[] {person.getName(),person.getLocation()});
	}
	
	public int updateRow(Person person,int id) {
		return jdbcTemplate.update("update person set name=?, location=? where id = ? ", new Object[] {person.getName(),person.getLocation(),id});
	}
}
