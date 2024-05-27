package org.example.housekg.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Heating extends BaseEntity{

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "heating_sequence"
    )
    @SequenceGenerator(
            name = "heating_sequence",
            sequenceName = "heating_sequence",
            allocationSize = 1,
            initialValue = 9
    )
    private Long id;
}
