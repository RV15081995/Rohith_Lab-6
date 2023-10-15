package com.greatlearning.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="StudentTable")
public class Student

{


@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private  String name;
	@Column(name="department")
	private String department;
	@Column(name="country")
	private String country;
	

	//public Student(int id,String name,String department, String country) {
		//super();
		//this.id = id;
		//this.name = name;
		//this.department = department;
		//this.country= country;
	//}
	public Student(String name, String department, String country) {
		this.name = name;
		this.department = department;
		this.country = country;
	}
	public Student() {
		// TODO Auto-generated constructor stub
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department= department;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", department=" + department + ", country=" + country+ "]";
	}
}