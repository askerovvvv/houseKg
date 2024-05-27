package org.example.housekg.repository;

import org.example.housekg.models.entity.State;
import org.example.housekg.models.entity.TypeOfDeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfDealRepository extends JpaRepository<TypeOfDeal, Long> {
}
