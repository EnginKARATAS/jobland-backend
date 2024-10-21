package jobland.backend.logging;

import java.util.List;

import jobland.backend.entities.Company;

public class ELKLogger implements Logger{

	@Override
	public void add(Company company) {
		System.out.println("ELK Log completed for "+ company.getCorporateName());
	}

 

}
	