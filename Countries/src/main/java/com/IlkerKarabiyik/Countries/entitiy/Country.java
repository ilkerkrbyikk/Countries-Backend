package com.IlkerKarabiyik.Countries.entitiy;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Country {
    @Id
    @GeneratedValue
    @Column(unique = true)
    private Long id;

    @Column(unique = true)
    private String code;
    private String nativeName;

    private int phone ;
    private String capital;
    private String continent;
    private String currency;
    private String languages;
    private String flag;
    //private List<Language> languages;
}
