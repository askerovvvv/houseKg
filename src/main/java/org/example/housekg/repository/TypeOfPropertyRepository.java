package org.example.housekg.repository;

import org.example.housekg.models.entity.TypeOfDeal;
import org.example.housekg.models.entity.TypeOfProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfPropertyRepository extends JpaRepository<TypeOfProperty, Long> {
}
