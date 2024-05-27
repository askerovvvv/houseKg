package org.example.housekg.repository;

import org.example.housekg.models.entity.Price;
import org.example.housekg.models.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
}
