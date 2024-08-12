package com.IlkerKarabiyik.Countries.mapper;

import com.IlkerKarabiyik.Countries.dto.CountryDto;
import com.IlkerKarabiyik.Countries.entitiy.Country;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    Country toCountry(CountryDto countryDto);

    CountryDto fromCountry(Country country);
}
