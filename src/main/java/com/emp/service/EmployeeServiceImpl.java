package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	List<Employee> list =  List.of(new Employee(1111L,"John Smith","65676545"),
			new Employee(1112L,"John Parker","65676545"),
			new Employee(1113L,"Tim Smith","65676545"),
			new Employee(1114L,"John Kims","65676545"),
			new Employee(1115L,"Laim Smith","65676545"));
	
	@Override
	public Employee getEmployee(Long id) {
		return list.stream().filter(employee->employee.geteId().equals(id)).findAny().orElse(null);
	}
	

}
