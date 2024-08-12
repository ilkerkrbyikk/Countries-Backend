package com.IlkerKarabiyik.Countries.controller;

import com.IlkerKarabiyik.Countries.dto.CountryDto;
import com.IlkerKarabiyik.Countries.entitiy.Country;
import com.IlkerKarabiyik.Countries.mapper.CountryMapper;
import com.IlkerKarabiyik.Countries.service.CountryService;
import com.IlkerKarabiyik.Countries.util.constants.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Api.Country.BASE_URL)
@AllArgsConstructor
public class CountryController {
    private CountryService countryService;
    private CountryMapper countryMapper;

    @GetMapping
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();

    }
    @PostMapping(Api.Country.INSERT_ALL)
    public List<Country> insertCountry(){
       return countryService.insertCountries();

    }
    @PostMapping("/")
    public ResponseEntity<CountryDto> insertCountry(@RequestBody CountryDto countryDto){
        Country mappedCountry = countryMapper.toCountry(countryDto);
        Country country = countryService.insertCountry(mappedCountry);
        return ResponseEntity.ok(countryMapper.fromCountry(country));
    }

}
