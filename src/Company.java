
public class Company {
	private int id;
	private String corporateName;
	private String email;
	private String website;
	private String location;
	private double companyPrice;
 
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	public String getCorporateName() {
		return corporateName;
	}
	public int getId() {
		return id;
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
