package jobland.backend.dataAccess;

import jobland.backend.entities.Company;

public class JDBCCompanyDao {
	public void add(Company company) {
		System.out.println("JDBC ile " + company.getCorporateName()+ " eklendi");
	}
}
