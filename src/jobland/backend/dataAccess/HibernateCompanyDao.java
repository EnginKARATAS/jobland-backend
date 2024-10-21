package jobland.backend.dataAccess;

import jobland.backend.entities.Company;

public class HibernateCompanyDao implements CompanyDao {
	public void add(Company company) {
		System.out.println("Hibernate ile " + company.getCorporateName()+ " eklendi");
	}
}
