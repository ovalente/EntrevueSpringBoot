package com.example.entrevueSpringBoot.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class RequeteCreationActeur implements Serializable {

    private String prenom;
    private String nom;
}
