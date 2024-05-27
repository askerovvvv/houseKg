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
public class TypeOfBuilding extends BaseEntity{
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "t_o_b_sequence"
    )
    @SequenceGenerator(
            name = "t_o_b_sequence",
            sequenceName = "t_o_b_sequence",
            allocationSize = 1,
            initialValue = 4
    )
    private Long id;
}
