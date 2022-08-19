package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.emp.entity.Employee;
import com.emp.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	IEmployeeService employeeService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{eid}")
	public Employee getEmployee(@PathVariable("eid") Long id) {
		Employee employee= employeeService.getEmployee(id);
		List records = this.restTemplate.getForObject("http://record-service/record/emp/"+id, List.class);
		employee.setRecords(records);
		return employee;
	}
	
	
}
