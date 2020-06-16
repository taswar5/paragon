package com.paragon.spring.data.jpa.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString*/


public class User {
	
	
	private int id;
	private String name;
	private String profession;
	private int age;
	private int panNum;

	
	public User(int id, String name, String profession, int age) {
		super();
		this.id = id;
		this.name = name;
		this.profession = profession;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", profession=" + profession + ", age=" + age + "]";
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
