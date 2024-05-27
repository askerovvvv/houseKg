package org.example.housekg.service.impl;

import org.example.housekg.exceptions.ObjectNotFoundException;
import org.example.housekg.service.ServiceForBooleanTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractServiceForBooleanTypeImpl<T, R extends JpaRepository<T, Long>> implements ServiceForBooleanTypes<T, R> {

    private final R repository;

    public AbstractServiceForBooleanTypeImpl(R repository) {
        this.repository = repository;
    }


    @Override
    public T findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Entity not found"));
    }
}
