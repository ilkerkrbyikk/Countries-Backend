package com.IlkerKarabiyik.Countries.service.interfaces;

import com.IlkerKarabiyik.Countries.entitiy.Country;

import java.util.List;

public interface ICountryService {
    List<Country> getAllCountries();

    List<Country> insertCountries();

    Country insertCountry(Country country);
}
