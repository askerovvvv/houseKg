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
public class Series extends BaseEntity{
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "series_sequence"
    )
    @SequenceGenerator(
            name = "series_sequence",
            sequenceName = "series_sequence",
            allocationSize = 1,
            initialValue = 15
    )
    private Long id;
}
