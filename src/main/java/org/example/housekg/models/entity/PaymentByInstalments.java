package org.example.housekg.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class PaymentByInstalments {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "payment_by_instalments_sequence"
    )
    @SequenceGenerator(
            name = "payment_by_instalments_sequence",
            sequenceName = "payment_by_instalments_sequence",
            allocationSize = 1
    )
    private Long id;
    private Boolean isPaymentByInstalmentAvailable;
}
