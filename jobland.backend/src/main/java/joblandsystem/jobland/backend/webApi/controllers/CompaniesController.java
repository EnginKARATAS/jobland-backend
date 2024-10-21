package joblandsystem.jobland.backend.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joblandsystem.jobland.backend.business.abstracts.CompanyService;
import joblandsystem.jobland.backend.entities.concrates.Company;

@RestController //annotation(bilgilendirme ifadesi)//it means this is a controller point
@RequestMapping("/api/companies")
public class CompaniesController {
	CompanyService companyService;
	
	public CompaniesController (CompanyService companyService)  {
		companyService = companyService;
	}
	
	public List<Company> getAll(){
		return companyService.getAll();
	}
}
