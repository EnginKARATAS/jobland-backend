package joblandsystem.jobland.backend.entities.concrates;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "companies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {
	private int id;
	private String corporateName;
	private String email;
	private String website;
	private String location;
	private double companyPrice;
}
