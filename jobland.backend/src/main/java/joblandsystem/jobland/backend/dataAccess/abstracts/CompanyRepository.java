package joblandsystem.jobland.backend.dataAccess.abstracts;

import java.util.List;

import joblandsystem.jobland.backend.entities.concrates.Company;

public interface CompanyRepository {
	List<Company> getAll();

}
