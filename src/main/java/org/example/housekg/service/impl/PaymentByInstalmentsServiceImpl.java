package org.example.housekg.service.impl;

import org.example.housekg.models.entity.PaymentByInstalments;
import org.example.housekg.repository.PaymentByInstalmentsRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentByInstalmentsServiceImpl extends AbstractServiceForBooleanTypeImpl<PaymentByInstalments, PaymentByInstalmentsRepository> {
    public PaymentByInstalmentsServiceImpl(PaymentByInstalmentsRepository repository) {
        super(repository);
    }
}
