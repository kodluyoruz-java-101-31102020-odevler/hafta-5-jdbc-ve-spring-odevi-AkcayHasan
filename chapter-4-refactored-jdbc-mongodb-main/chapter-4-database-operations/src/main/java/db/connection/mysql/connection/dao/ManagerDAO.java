package db.connection.mysql.connection.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import db.connection.mysql.connection.DbSQLQuery;
import db.connection.mysql.connection.model.Employee;
import db.connection.mysql.connection.model.Manager;

public class ManagerDAO {

	public List<Manager> loadAllActiveManagers() {
		
		List<Manager> managers = new ArrayList<Manager>();
		
		// Burada halen aktif olarak yöneticilik yapan tüm çalışanları departman isimleriyle birlikte liste halinde hazırlayınız.
		// Manager sınıfını sizin oluşturdum. 
		// İpucu: Bu sorgunun bir benzerini derste anlatmıştım. Hatta "sql_query_samples.sql" dosyası içinde benzeri mevcut.
		
		String sql = "select emp.*, dm.*, dp.* from employees emp "
				+ "left join dept_manager dm on dm.emp_no = emp.emp_no "
				+ "left join departments dp on dp.dept_no = dm.dept_no where dm.to_date >= NOW();";
		ResultSet resultSet = DbSQLQuery.select(sql);
		
		try {

			while(resultSet.next()){
				
				String departmentName =  resultSet.getString("dept_name");
				Long employeeNo =  resultSet.getLong("emp_no");
				String employeeName =  resultSet.getString("first_name");
				String employeeLastName =  resultSet.getString("last_name");
				String employeeGender =  resultSet.getString("gender");
				Date employeeBirthDate =  resultSet.getDate("birth_date");
				Date employeeHireDate =  resultSet.getDate("hire_date");

				Employee employee =  new Employee();

				employee.setId(employeeNo);
				employee.setName(employeeName);
				employee.setLastName(employeeLastName);
				employee.setGender(employeeGender);
				employee.setBirthDate(employeeBirthDate);
				employee.setHireDate(employeeHireDate);

				Manager manager =  new Manager(employee,departmentName);
				
				managers.add(manager);

			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return managers;
	}
	
}
