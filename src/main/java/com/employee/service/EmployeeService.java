package com.employee.service;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.employee.entities.Employee;
import com.employee.repositories.DepartentRepository;
import com.employee.repositories.EmployeeRepository;

@org.springframework.stereotype.Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employee_repo;
	
	@Autowired
	private DepartentRepository departent_repo;
	
	Logger logger = LoggerFactory.getLogger(EmployeeService.class);
	

	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Employee employees)   
	{  
	employee_repo.save(employees);  
	}

	public List<Employee> getAllEmployee() {
			logger.info("in service class and fetch all data ");
			List<Employee> st = new ArrayList<>();
			employee_repo.findAll().forEach(employee -> st.add(employee));
			;
			return st;
		}

//	public List<Employee> getByDepartentName(String departentName) {
//		int id=departent_repo.findByname(departentName);		
//		return employee_repo.findByDepartent_id(id);
//	}

	public boolean isExistEmployeeId(Integer id) {
		logger.info("check data exist or not");
		return employee_repo.existsById(id);
		
	}

	public void UpdateEmployee(Employee employee) {
		employee_repo.save(employee);
		
	}
	 
}
