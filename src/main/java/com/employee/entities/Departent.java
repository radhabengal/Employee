package com.employee.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Departent")
public class Departent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "departmentid")
	private int Departent_Id;

	@Column(name = "departname")
	private String departent_name;

	public Departent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departent(int departent_Id, String departent_name) {
		super();
		Departent_Id = departent_Id;
		this.departent_name = departent_name;
	}

	public int getDepartent_Id() {
		return Departent_Id;
	}

	public void setDepartent_Id(int departent_Id) {
		Departent_Id = departent_Id;
	}

	public String getDepartent_name() {
		return departent_name;
	}

	public void setDepartent_name(String departent_name) {
		this.departent_name = departent_name;
	}

	@Override
	public String toString() {
		return "Departent [Departent_Id=" + Departent_Id + ", departent_name=" + departent_name + "]";
	}
	
	

}
