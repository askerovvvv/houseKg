package org.example.housekg.repository;

import org.example.housekg.models.entity.Series;
import org.example.housekg.models.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Long> {
}
