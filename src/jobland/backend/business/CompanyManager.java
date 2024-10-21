package jobland.backend.business;

import jobland.backend.dataAccess.CompanyDao;
import jobland.backend.dataAccess.JDBCCompanyDao;
import jobland.backend.entities.Company;

public class CompanyManager {
	private CompanyDao companyDao;
	public CompanyManager(CompanyDao dao) {
		this.companyDao = dao;
		
	}
	public void add(Company company) throws Exception {
		if (company.getCompanyPrice() < 39000) {
			throw new Exception("Company price not acceptable for our policy rules");
		}
		 
		
		companyDao.add(company);
	}

}
