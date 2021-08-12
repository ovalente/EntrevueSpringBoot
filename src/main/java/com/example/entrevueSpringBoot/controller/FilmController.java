package com.example.entrevueSpringBoot.controller;

import com.example.entrevueSpringBoot.dto.ReponseFilm;
import com.example.entrevueSpringBoot.dto.RequeteCreationFilm;
import com.example.entrevueSpringBoot.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/film")
public class FilmController {

    private final FilmService filmService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReponseFilm> create(@RequestBody final RequeteCreationFilm requete) {
        return ResponseEntity.status(HttpStatus.CREATED).body(new ReponseFilm(filmService.createFilm(requete.buildFilm())));
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReponseFilm> getById(@PathVariable("id") final Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(new ReponseFilm(filmService.getFilmById(id)));
    }
}
