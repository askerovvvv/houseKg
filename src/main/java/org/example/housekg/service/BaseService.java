package org.example.housekg.service;

import java.util.List;

public interface BaseService<T, D, R> {
    List<D> findAll();
    String save(D dto);
    D findById(Long id);
    T findByIdAndReturnEntity(Long id);
    String deleteById(Long id);
}
