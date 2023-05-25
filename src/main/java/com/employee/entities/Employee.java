package com.employee.entities;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int Employee_Id;

	@Column(name = "Emp_Name")
	private String name;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "departent_id")
	private int departentId;
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "departent_fk")
	private Departent departent_obj;

	@OneToMany(targetEntity = Address.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "address_fk")
	private List<Address> address_obj;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employee_Id, String name, String gender, String contact, int departentId,
			Departent departent_obj, List<Address> address_obj) {
		super();
		Employee_Id = employee_Id;
		this.name = name;
		this.gender = gender;
		this.contact = contact;
		this.departentId = departentId;
		this.departent_obj = departent_obj;
		this.address_obj = address_obj;
	}

	public int getEmployee_Id() {
		return Employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getDepartentId() {
		return departentId;
	}

	public void setDepartentId(int departentId) {
		this.departentId = departentId;
	}

	public Departent getDepartent_obj() {
		return departent_obj;
	}

	public void setDepartent_obj(Departent departent_obj) {
		this.departent_obj = departent_obj;
	}

	public List<Address> getAddress_obj() {
		return address_obj;
	}

	public void setAddress_obj(List<Address> address_obj) {
		this.address_obj = address_obj;
	}

	@Override
	public String toString() {
		return "Employee [Employee_Id=" + Employee_Id + ", name=" + name + ", gender=" + gender + ", contact=" + contact
				+ ", departentId=" + departentId + ", departent_obj=" + departent_obj + ", address_obj=" + address_obj
				+ "]";
	}

	

}
