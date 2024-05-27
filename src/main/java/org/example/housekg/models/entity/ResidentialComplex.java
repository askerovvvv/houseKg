package org.example.housekg.models.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class ResidentialComplex extends BaseEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "residential_complex_sequence"
    )
    @SequenceGenerator(
            name = "residential_complex_sequence",
            sequenceName = "residential_complex_sequence",
            allocationSize = 1,
            initialValue = 4
    )
    private Long id;
}
