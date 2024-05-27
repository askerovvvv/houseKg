package org.example.housekg.repository;

import org.example.housekg.models.entity.ResidentialComplex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentialComplexRepository extends JpaRepository<ResidentialComplex, Long> {
}
