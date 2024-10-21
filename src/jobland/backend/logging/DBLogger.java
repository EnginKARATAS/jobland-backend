package jobland.backend.logging;

import jobland.backend.entities.Company;

public class DBLogger implements Logger{

	@Override
	public void add(Company company) {
		System.out.println("Db Log completed for "+ company.getCorporateName());
	}

}
