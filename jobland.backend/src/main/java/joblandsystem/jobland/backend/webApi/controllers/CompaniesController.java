package joblandsystem.jobland.backend.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joblandsystem.jobland.backend.business.abstracts.CompanyService;
import joblandsystem.jobland.backend.entities.concrates.Company;

@RestController //annotation(bilgilendirme ifadesi)//it means this is a controller point
@RequestMapping("/api/companies")
public class CompaniesController {
	private CompanyService companyService;
	@Autowired //autowired annot is default in new spring versions
	public CompaniesController (CompanyService companyService)  {
		this.companyService = companyService;
	}
	
	@GetMapping("/getall")
	public List<Company> getAll(){
		return companyService.getAll(); 
	}
}
