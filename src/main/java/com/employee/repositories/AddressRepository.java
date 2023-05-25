package com.employee.repositories;

import org.springframework.data.repository.CrudRepository;

import com.employee.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Integer>{

}
