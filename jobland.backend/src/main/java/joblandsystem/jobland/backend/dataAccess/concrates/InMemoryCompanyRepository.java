package joblandsystem.jobland.backend.dataAccess.concrates;

import java.util.ArrayList;
import java.util.List;

import joblandsystem.jobland.backend.dataAccess.abstracts.CompanyRepository;
import joblandsystem.jobland.backend.entities.concrates.Company;

public class InMemoryCompanyRepository implements CompanyRepository {
	List<Company> companies;
	
	public InMemoryCompanyRepository() {
		this.companies = new ArrayList<Company>();
		companies.add(new Company(1, "BİM", "bim@bim.com"));
	}
	@Override
	public List<Company> getAll() {
		// TODO Auto-generated method stub
		return companies;
	}

}
