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
public class Mortgage {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "mortgage_sequence"
    )
    @SequenceGenerator(
            name = "mortgage_sequence",
            sequenceName = "mortgage_sequence",
            allocationSize = 1
    )
    private Long id;
    private Boolean isMortgageAvailable;
}
