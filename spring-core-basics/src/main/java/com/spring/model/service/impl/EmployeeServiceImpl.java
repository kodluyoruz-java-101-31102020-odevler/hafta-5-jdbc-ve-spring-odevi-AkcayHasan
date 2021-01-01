package com.spring.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.dao.IEmployeeDao;
import com.spring.model.service.IEmployeeService;

@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeDao employeeDao;
	
	
	public List<String> getAll() {
		
		return employeeDao.getNames();
	}

}
