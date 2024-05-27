package org.example.housekg.repository;

import org.example.housekg.models.entity.NumberOfRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberOfRoomRepository extends JpaRepository<NumberOfRoom, Long> {
}
