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
public class PossibilityOfExchange extends BaseEntity{
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "p_o_e_sequence"
    )
    @SequenceGenerator(
            name = "p_o_e_sequence",
            sequenceName = "p_o_e_sequence",
            allocationSize = 1,
            initialValue = 5
    )
    private Long id;
}
