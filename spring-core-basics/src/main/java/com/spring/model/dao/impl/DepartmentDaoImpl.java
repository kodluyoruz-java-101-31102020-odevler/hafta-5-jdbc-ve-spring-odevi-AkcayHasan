package com.spring.model.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.model.dao.IDepartmentDao;
@Repository("departmentDaoImpl")
public class DepartmentDaoImpl implements IDepartmentDao{

	public List<String> getNames() {
		
		return Arrays.asList("İnsan Kaynakları", "Mühendislik", "Pazarlama");
	}

}
