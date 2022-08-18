package com.emp.entity;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private Long eId;
	private String name;
	private String phone;
	
	List<Record> records=new ArrayList<>();

	public Long geteId() {
		return eId;
	}

	public void seteId(Long eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	public Employee(Long eId, String name, String phone, List<Record> records) {
		super();
		this.eId = eId;
		this.name = name;
		this.phone = phone;
		this.records = records;
	}

	public Employee() {
		super();
	}

	public Employee(Long eId, String name, String phone) {
		super();
		this.eId = eId;
		this.name = name;
		this.phone = phone;
	}
	
}
