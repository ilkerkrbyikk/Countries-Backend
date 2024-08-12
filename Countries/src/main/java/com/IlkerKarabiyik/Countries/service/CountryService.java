package com.IlkerKarabiyik.Countries.service;

import com.IlkerKarabiyik.Countries.entitiy.Country;
import com.IlkerKarabiyik.Countries.initializer.CountryInitializer;
import com.IlkerKarabiyik.Countries.repository.CountryRepository;
import com.IlkerKarabiyik.Countries.service.interfaces.ICountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryService implements ICountryService {

    private CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public List<Country> insertCountries() {
        return countryRepository.saveAll(CountryInitializer.readCountries());
    }

    @Override
    public Country insertCountry(Country country) {
        // servis kodları id tekrara düştü mü kodları vs yazılacak.
        // Exception package'ındaki exceptionları fırlattır.
        // I18N messages paketlerine göre exception fırlatma
        return countryRepository.save(country);
    }
}
