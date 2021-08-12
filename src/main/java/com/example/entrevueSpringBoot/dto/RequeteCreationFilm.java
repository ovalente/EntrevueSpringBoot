package com.example.entrevueSpringBoot.dto;

import com.example.entrevueSpringBoot.domain.Acteur;
import com.example.entrevueSpringBoot.domain.Film;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Data;
import org.springframework.util.CollectionUtils;

@Data
public class RequeteCreationFilm implements Serializable {

    private String titre;
    private String description;
    private List<RequeteCreationActeur> acteurs;

    public Film buildFilm() {
        List<Acteur> filmActeurs = null;

        if (!CollectionUtils.isEmpty(acteurs)) {
            filmActeurs = acteurs.stream().map(acteur -> Acteur.builder()
                                             .nom(acteur.getNom())
                                             .prenom(acteur.getPrenom())
                                             .build())
                   .collect(Collectors.toCollection(ArrayList::new));
        }

        return Film.builder()
                   .titre(titre)
                   .description(description)
                   .acteurs(filmActeurs)
                   .build();
    }
}
