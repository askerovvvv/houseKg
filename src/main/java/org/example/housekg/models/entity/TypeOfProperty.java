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
public class TypeOfProperty extends BaseEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "t_o_p_sequence"
    )
    @SequenceGenerator(
            name = "t_o_p_sequence",
            sequenceName = "t_o_p_sequence",
            allocationSize = 1,
            initialValue = 8
    )
    private Long id;
}
