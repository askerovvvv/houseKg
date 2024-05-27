package org.example.housekg.repository;

import org.example.housekg.models.entity.Mortgage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MortgageRepository extends JpaRepository<Mortgage, Long> {
}
