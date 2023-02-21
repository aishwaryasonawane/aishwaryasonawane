package com.hibernateassignment.HibernateAssignment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Laptop {

	@Id @Column(name="Laptop_Id")
	private int L_id;
	private String L_name;
	@OneToOne
	@JoinColumn(name="Student_name")
	private Student student;
	
	//generate getter and setter
	public int getL_id() {
		return L_id;
	}
	public void setL_id(int l_id) {
		L_id = l_id;
	}
	public String getL_name() {
		return L_name;
	}
	public void setL_name(String l_name) {
		L_name = l_name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	//constructor method
	public Laptop(int l_id, String l_name, Student student) {
		super();
		L_id = l_id;
		L_name = l_name;
		this.student = student;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	

}


