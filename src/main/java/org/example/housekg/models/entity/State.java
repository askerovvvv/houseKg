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
public class State extends BaseEntity{
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "state_sequence"
    )
    @SequenceGenerator(
            name = "state_sequence",
            sequenceName = "state_sequence",
            allocationSize = 1,
            initialValue = 6
    )
    private Long id;
}
