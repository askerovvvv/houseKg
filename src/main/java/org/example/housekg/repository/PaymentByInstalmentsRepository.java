package org.example.housekg.repository;

import org.example.housekg.models.entity.PaymentByInstalments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentByInstalmentsRepository extends JpaRepository<PaymentByInstalments, Long> {
}
