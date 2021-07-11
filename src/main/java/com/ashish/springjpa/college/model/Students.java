package com.ashish.springjpa.college.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
	private int roll_no;
	private String name;
	private String sname;
	
	public Students () {}

	public Students(int roll_no, String name, String sname) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.sname = sname;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		
		return "Student [roll no = " + roll_no + ", name = " + name + ", surname = " + sname + "]";
	}

}
