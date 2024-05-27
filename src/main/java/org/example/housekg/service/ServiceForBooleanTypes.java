package org.example.housekg.service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceForBooleanTypes<T, R extends JpaRepository<T, Long>> {
    T findById(Long id);
}
