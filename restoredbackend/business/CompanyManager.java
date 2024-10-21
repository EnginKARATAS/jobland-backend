package jobland.backend.business;

import java.util.List;

import jobland.backend.dataAccess.CompanyDao;
import jobland.backend.dataAccess.JDBCCompanyDao;
import jobland.backend.entities.Company;
import jobland.backend.logging.Logger;

public class CompanyManager {
	private CompanyDao companyDao;
	private Logger[] loggers;
	
	public CompanyManager(CompanyDao dao, Logger[] loggers) {
		this.companyDao = dao;
		this.loggers = loggers;
		
	}
	public void add(Company company) throws Exception {
		if (company.getCompanyPrice() < 39000) {
			throw new Exception("Company price not acceptable for our policy rules");
		}
		 
		companyDao.add(company);
		for (Logger logger : loggers) {
			logger.add(company);
		}
	}

}
