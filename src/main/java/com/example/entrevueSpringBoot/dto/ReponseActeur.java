package com.example.entrevueSpringBoot.dto;

import com.example.entrevueSpringBoot.domain.Acteur;
import java.io.Serializable;
import lombok.Data;

@Data
public class ReponseActeur implements Serializable {

    private Long id;
    private String prenom;
    private String nom;

    public ReponseActeur(Acteur acteur) {
        this.id = acteur.getId();
        this.prenom = acteur.getPrenom();
        this.nom = acteur.getNom();
    }
}
