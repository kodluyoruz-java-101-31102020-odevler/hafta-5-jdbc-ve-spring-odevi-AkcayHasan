package com.spring.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.dao.IDepartmentDao;
import com.spring.model.service.IDepartmentService;

@Service("departmentServiceImpl")
public class DepartmentServiceImpl implements IDepartmentService{
	
	@Autowired
	private IDepartmentDao departmenDao;

	public List<String> getAll() {
		
		return departmenDao.getNames();
	}

}
