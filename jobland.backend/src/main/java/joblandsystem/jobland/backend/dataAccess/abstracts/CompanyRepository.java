package joblandsystem.jobland.backend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import joblandsystem.jobland.backend.entities.concrates.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{//You dont have to create concrate. JpaRepository auto doing it
}
