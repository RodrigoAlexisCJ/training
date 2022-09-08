package com.tcs.JDBC.entity;

public class Person {
	
	private long id;
//	@Column(name="name")
	private String name;
	private String location;
	
	public Person() {
	}
	
	public Person(long id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public Person(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
	
}
