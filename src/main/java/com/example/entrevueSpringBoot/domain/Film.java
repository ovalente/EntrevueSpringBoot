package com.example.entrevueSpringBoot.domain;

import com.example.entrevueSpringBoot.dto.ReponseActeur;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Film {

    private Long id;
    private String titre;
    private String description;
    private List<Acteur> acteurs;
}
