package org.example.housekg.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

public interface BaseMapper<T, D> {
    D toBaseDto(T baseEntity);
    T toBaseEntity(D baseDto);
}

