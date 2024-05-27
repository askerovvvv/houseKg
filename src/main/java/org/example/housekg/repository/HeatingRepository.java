package org.example.housekg.repository;

import org.example.housekg.models.entity.Heating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeatingRepository extends JpaRepository<Heating, Long> {
}
