package org.example.housekg.service.impl;

import org.example.housekg.models.entity.Mortgage;
import org.example.housekg.repository.MortgageRepository;
import org.springframework.stereotype.Service;

@Service
public class MortgageServiceImpl extends AbstractServiceForBooleanTypeImpl<Mortgage, MortgageRepository> {
    public MortgageServiceImpl(MortgageRepository repository) {
        super(repository);
    }
}
