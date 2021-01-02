package db.connection.mysql.connection.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import db.connection.mysql.connection.DbSQLQuery;
import db.connection.mysql.connection.model.Department;


public class DepartmentDAO {

	private static final Logger logger = Logger.getLogger(DepartmentDAO.class);

	
	public List<Department> getAll() {
		
		List<Department> departments = new ArrayList<Department>();
		
		// Tüm departman listesini çeken SQL komutunu aşağıdaki satıra yazınız.
		ResultSet resultSet = DbSQLQuery.select("SELECT * FROM departments");
		
		try {
			
			// ResultSet içinde veritabanından gelen department kayıtları var.
			// ResultSet üzerinde satır satır ilerleyerek bir Department listesi oluştur.
			// List<Department> departments bu listeye elemanları ekleyeceksiniz.
			
			// Kodlar ... :)
			
			if(resultSet == null) {
				return departments;
			}

			while(resultSet.next()) {

				Department department = createDepartment(resultSet);
				departments.add(department);
			}
			
		}
		catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return departments;
	}
	
	public Department createDepartment(ResultSet resultSet) throws SQLException{
		Department department=new Department("","");
		department.setName(resultSet.getString("dept_name"));
		department.setDeptNo(resultSet.getString("dept_no"));

		return department;

	}
}
