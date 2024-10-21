package jobland.backend.logging;

import jobland.backend.entities.Company;

public class FileLogger implements Logger {

	@Override
	public void add(Company company) {
		System.out.println("File Log completed for "+ company.getCorporateName());		
	}

}
