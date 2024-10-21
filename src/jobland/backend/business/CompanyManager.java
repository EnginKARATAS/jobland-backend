package jobland.backend.business;

import jobland.backend.dataAccess.JDBCCompanyDao;
import jobland.backend.entities.Company;

public class CompanyManager {
	public void add(Company company) throws Exception {
		if (company.getCompanyPrice() < 39000) {
			throw new Exception("Company price not acceptable for our policy rules");
		}
		JDBCCompanyDao productDao = new JDBCCompanyDao();
		productDao.add(company);
	}
}
