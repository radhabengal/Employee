package com.employee.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

//	@Query("select * from Employee e where e.departmentid =:departmentid")
//	public List<Employee> findByDepartent_id(int departent_id);

}
