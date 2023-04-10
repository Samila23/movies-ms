package com.movies.ms.repository;

import com.movies.ms.model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long>{

    Optional<MovieEntity> findByImdbIdIgnoreCase(final String ImdbId);

}
