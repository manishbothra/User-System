package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class User {
	@Id
	private int id;
	private String comName,comId,emp;
	public User(int id,String comName, String comId, String emp) {
		super();
		this.id=id;
		this.comName = comName;
		this.comId = comId;
		this.emp = emp;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getComName() {
		return comName;
	}


	public void setComName(String comName) {
		this.comName = comName;
	}


	public String getComId() {
		return comId;
	}


	public void setComId(String comId) {
		this.comId = comId;
	}


	public String getEmp() {
		return emp;
	}


	public void setEmp(String emp) {
		this.emp = emp;
	}


	public User() {
		
	}
}
