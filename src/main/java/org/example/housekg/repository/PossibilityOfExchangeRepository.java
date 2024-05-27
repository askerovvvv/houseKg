package org.example.housekg.repository;

import org.example.housekg.models.entity.PossibilityOfExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PossibilityOfExchangeRepository extends JpaRepository<PossibilityOfExchange, Long> {
}
