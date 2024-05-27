package org.example.housekg.models.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class NumberOfRoom {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "number_of_rooms_sequence"
    )
    @SequenceGenerator(
            name = "number_of_rooms_sequence",
            sequenceName = "number_of_rooms_sequence",
            allocationSize = 1
    )
    private Long id;
    private Integer numberOfRooms;
}
