package com.hibernateassignment.ManyToManyHibernate;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Project {
	@Id @Column(name="Project_Id")
	private int Pid;
	private String pname;
	@ManyToMany (mappedBy="project")
    private List<Employee>employee;
	
	//getter setter
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	//constructor
	public Project(int pid, String pname, List<Employee> employee) {
		super();
		Pid = pid;
		this.pname = pname;
		this.employee = employee;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	

}
