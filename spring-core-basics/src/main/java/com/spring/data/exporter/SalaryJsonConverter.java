package com.spring.data.exporter;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.dto.Salary;


public class SalaryJsonConverter {
	
	public String convertToJson(Salary salary) throws JsonProcessingException{
		
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(salary);
		
	}

}
