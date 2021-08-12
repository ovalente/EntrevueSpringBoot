package com.example.entrevueSpringBoot.dto;

import com.example.entrevueSpringBoot.domain.Film;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Data;
import org.springframework.util.CollectionUtils;

@Data
public class ReponseFilm implements Serializable {

    private Long id;
    private String titre;
    private String description;
    private List<ReponseActeur> acteurs;

    public ReponseFilm (Film film) {
        if (film != null) {
            this.id = film.getId();
            this.titre = film.getTitre();
            this.description = film.getDescription();

            if (!CollectionUtils.isEmpty(film.getActeurs())) {
                this.acteurs = film.getActeurs().stream().map(ReponseActeur::new)
                                      .collect(Collectors.toCollection(ArrayList::new));
            }
        }
    }
}
