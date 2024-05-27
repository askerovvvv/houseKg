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
public class TypeOfDeal extends BaseEntity{
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "t_o_d_sequence"
    )
    @SequenceGenerator(
            name = "t_o_d_sequence",
            sequenceName = "t_o_d_sequence",
            allocationSize = 1,
            initialValue = 3
    )
    private Long id;
}
