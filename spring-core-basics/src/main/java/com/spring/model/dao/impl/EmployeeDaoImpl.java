package com.spring.model.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.model.dao.IEmployeeDao;
@Repository("employeeDaoImpl")
public class EmployeeDaoImpl implements IEmployeeDao{

	public List<String> getNames() {
		
		return Arrays.asList("Ahmet", "Ayşe", "Ali");
	}
	
	

}
