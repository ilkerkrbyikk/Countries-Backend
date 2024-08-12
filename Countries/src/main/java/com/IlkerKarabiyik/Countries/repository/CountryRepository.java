package com.IlkerKarabiyik.Countries.repository;

import com.IlkerKarabiyik.Countries.entitiy.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}
