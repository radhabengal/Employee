package com.employee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entities.Employee;
import com.employee.exception.EmployeeNotFound;
import com.employee.service.EmployeeService;

//mark class as Controller  
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	// creating post mapping that save the employee detail in the database
	@PostMapping("/employee")
	public String saveEmployee(@RequestBody Employee employee) {
		logger.info("in save method to save employee details");
		service.saveOrUpdate(employee);
		return "Employee save successfully-----"+employee.getEmployee_Id();
	}
	
	// get all employee
		@GetMapping("/employee")
		public List<Employee> getAllEmployee() {
			logger.info("in getAllEmployee() method to get employee details");
			return service.getAllEmployee();
		}
		
//		//fetch employee data by department
//		@GetMapping("/employee/department")
//		public ResponseEntity<Object> getEmployeeByDepartmentName(@RequestParam String departentName) {			
//				List<Employee> employee = service.getByDepartentName(departentName);
//				return new ResponseEntity<>(employee, HttpStatus.OK);
//		}
		
		//handle exception
		@PutMapping("/employee")
		public String UpdateEmployee(@RequestBody Employee employee, @RequestParam Integer id) {
			logger.info("in update Employee() method to update employee details");
			boolean isExistEmployeeId = service.isExistEmployeeId(id);
			if (isExistEmployeeId) {
				service.UpdateEmployee(employee);
				return "Employee update successfully" + id;
			} else {
				logger.error("employee not found--------");
				throw new EmployeeNotFound("Employee not found ***********");
			}

		}
			

}
