package jobland.backend.entities;

public class Company {
	private int id;
	private String corporateName;
	private String email;
	private String website;
	private String location;
	private double companyPrice;
	
	public Company() {
  	}

	public Company(int id, String corporateName, String email, String website, String location, double companyPrice) {
 		this.id = id;
		this.corporateName = corporateName;
		this.email = email;
		this.website = website;
		this.location = location;
		this.companyPrice = companyPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getCompanyPrice() {
		return companyPrice;
	}

	public void setCompanyPrice(double companyPrice) {
		this.companyPrice = companyPrice;
	}
	

}
