package com.example.entrevueSpringBoot.mapper;

import com.example.entrevueSpringBoot.domain.Film;
import com.example.entrevueSpringBoot.entity.FilmEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FilmMapper {

    FilmMapper INSTANCE = Mappers.getMapper(FilmMapper.class);

    FilmEntity filmToFilmEntity(Film film);
    Film filmEntityToFilm(FilmEntity filmEntity);
}
