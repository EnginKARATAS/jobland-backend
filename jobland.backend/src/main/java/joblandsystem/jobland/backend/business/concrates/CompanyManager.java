package joblandsystem.jobland.backend.business.concrates;

import java.util.List;

import org.springframework.stereotype.Service;

import joblandsystem.jobland.backend.business.abstracts.CompanyService;
import joblandsystem.jobland.backend.dataAccess.abstracts.CompanyRepository;
import joblandsystem.jobland.backend.entities.concrates.Company;

@Service //this class is a business object
public class CompanyManager implements CompanyService{
	private CompanyRepository companyRepository;
	
	
	public CompanyManager(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	@Override
	public List<Company> getAll() {
		return this.companyRepository.findAll();
	}
 

}
