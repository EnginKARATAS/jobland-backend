package jobland.backend.entities;

public class CorporateCompany extends Company{
	private int taxNumber;
 
	
	public int getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(int taxNumber) {
		this.taxNumber = taxNumber;
	}
 
}
