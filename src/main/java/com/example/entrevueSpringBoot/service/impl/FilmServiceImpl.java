package com.example.entrevueSpringBoot.service.impl;

import com.example.entrevueSpringBoot.domain.Film;
import com.example.entrevueSpringBoot.entity.FilmEntity;
import com.example.entrevueSpringBoot.mapper.FilmMapper;
import com.example.entrevueSpringBoot.repository.FilmRepository;
import com.example.entrevueSpringBoot.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

    private final FilmMapper filmMapper;
    private final FilmRepository filmRepository;

    @Override
    @Transactional
    public Film createFilm(Film film) {
        FilmEntity filmEntity = filmMapper.filmToFilmEntity(film);
        return filmMapper.filmEntityToFilm(filmRepository.save(filmEntity));
    }

    @Override
    @Transactional(readOnly = true)
    public Film getFilmById(Long id) {
        return filmMapper.filmEntityToFilm(filmRepository.getOne(id));
    }
}
