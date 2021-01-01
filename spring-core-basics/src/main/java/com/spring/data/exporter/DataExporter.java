package com.spring.data.exporter;

import org.springframework.beans.factory.annotation.Autowired;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.spring.dto.Salary;

public class DataExporter {
	
	@Autowired
	private SalaryJsonConverter salaryJsonConverter;
	
	public String convertSalaryToJson(Salary salary) {
		
		try {
			return salaryJsonConverter.convertToJson(salary);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return " ";
	}

}
