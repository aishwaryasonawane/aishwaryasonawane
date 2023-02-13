package com.hibernateProj.empdeptproj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="Course_Table")
public class Course {
	@Id @Column(name="Course_Id")
	private int cid;
	private String cname;
	//getter and setter
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	//constructor
			public Course(int cid, String cname) {
				super();
				this.cid = cid;
				this.cname = cname;
			}
		
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		

}
