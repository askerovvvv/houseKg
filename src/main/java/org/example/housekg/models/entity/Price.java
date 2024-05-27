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
public class Price extends BaseEntity{
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "price_sequence"
    )
    @SequenceGenerator(
            name = "price_sequence",
            sequenceName = "price_sequence",
            allocationSize = 1,
            initialValue = 3
    )
    private Long id;
    private Double price;
}
