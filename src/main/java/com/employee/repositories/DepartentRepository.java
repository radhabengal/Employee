package com.employee.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.employee.entities.Departent;

public interface DepartentRepository extends CrudRepository<Departent, Integer> {
	
//	@Query("select departmentid from Departent d where d.departname =:name")
//	public int findByname(String name);
	
}
