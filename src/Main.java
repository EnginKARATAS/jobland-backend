import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		IndividualCompany individual = new IndividualCompany();
		individual.setCorporateName("solitude");
		individual.setIndividualName("engin karataş");
		individual.setEmail("career@canonical.com");
		individual.setLocation("UK");
		individual.setWebsite("www.canonical.com");

		CorporateCompany corporate = new CorporateCompany();
		corporate.setCorporateName("Canonical");
		corporate.setTaxNumber(31289832);
		corporate.setCompanyPrice(399999);

		Company[] companies = { individual, corporate };

		for (Company companyItem : companies) {
			System.out.println(companyItem.getCorporateName() + " application successful");
		}

	}

}
