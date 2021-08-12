package com.example.entrevueSpringBoot.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Acteur {

    private Long id;
    private String prenom;
    private String nom;


}
