package joblandsystem.jobland.backend.business.abstracts;

import java.util.List;

import joblandsystem.jobland.backend.entities.concrates.Company;

public interface CompanyService {
	List<Company> getAll();
}
