package jobland.backend;
import java.util.Iterator;

import jobland.backend.business.CompanyManager;
import jobland.backend.dataAccess.HibernateCompanyDao;
import jobland.backend.dataAccess.JDBCCompanyDao;
import jobland.backend.entities.Company;
import jobland.backend.entities.CorporateCompany;
import jobland.backend.entities.IndividualCompany;

public class Main {

	public static void main(String[] args) throws Exception {
		IndividualCompany individual = new IndividualCompany();
		individual.setCorporateName("solitude");
		individual.setIndividualName("engin karataş");
		individual.setEmail("career@canonical.com");
		individual.setLocation("UK");
		individual.setWebsite("www.canonical.com");

		CorporateCompany corporate = new CorporateCompany();
		corporate.setCorporateName("Canonical");
		corporate.setTaxNumber(31289832);
		corporate.setCompanyPrice(399999);

		Company[] companies = { individual, corporate };

		for (Company companyItem : companies) {
			System.out.println(companyItem.getCorporateName() + " application successful");
		}
		
		CompanyManager companyManager = new CompanyManager(new JDBCCompanyDao());
		companyManager.add(corporate);

	}

}
