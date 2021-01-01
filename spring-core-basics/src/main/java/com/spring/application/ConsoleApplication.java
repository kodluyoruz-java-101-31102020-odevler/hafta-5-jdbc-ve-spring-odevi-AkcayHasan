package com.spring.application;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.data.exporter.DataExporter;
import com.spring.dto.Salary;
import com.spring.model.service.IDepartmentService;
import com.spring.model.service.IEmployeeService;
@Component
public class ConsoleApplication implements CommandLineRunner {

	@Autowired
	private DataExporter dataExporter;
	
	@Autowired
	private IEmployeeService employeeService;
	
	@Autowired
	private IDepartmentService departmentService;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	public void run(String... args) throws Exception {
		
		Salary salary1 = applicationContext.getBean("salary",Salary.class);
		salary1.setValue(15000);
		salary1.setCreateDate(new Date());
		
		String json = dataExporter.convertSalaryToJson(salary1);
		System.out.println(json);
		
		System.out.println("Çalışan Listesi");
		System.out.println(employeeService.getAll());
		
		System.out.println("Departman Listesi");
		System.out.println(departmentService.getAll());
		
		
	}

}
