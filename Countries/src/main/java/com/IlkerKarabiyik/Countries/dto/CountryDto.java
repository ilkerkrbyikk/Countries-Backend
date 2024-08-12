package com.IlkerKarabiyik.Countries.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CountryDto {
    private Long id;

    private String code;
    private String nativeName;
    private int phone ;
    private String capital;
    private String continent;
    private String currency;
    private String languages;
    private String flag;
}
