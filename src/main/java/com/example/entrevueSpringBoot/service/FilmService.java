package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.domain.Film;

public interface FilmService {

    Film createFilm(Film film);
    Film getFilmById(Long id);

}
