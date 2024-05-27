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
public class Advertisement {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "advertisement_sequence"
    )
    @SequenceGenerator(
            name = "advertisement_sequence",
            sequenceName = "advertisement_sequence",
            allocationSize = 1,
            initialValue = 9
    )
    private Long id;

    @ManyToOne
    private Heating heating;

    @ManyToOne
    private Mortgage mortgage;

    @ManyToOne
    private NumberOfRoom numberOfRooms;

    @ManyToOne
    private PaymentByInstalments paymentByInstalments;

    @ManyToOne
    private PossibilityOfExchange possibilityOfExchange;

    @ManyToOne
    private Price price;

    @ManyToOne
    private ResidentialComplex residentialComplex;

    @ManyToOne
    private Series series;

    @ManyToOne
    private State state;

    @ManyToOne
    private TypeOfBuilding typeOfBuilding;

    @ManyToOne
    private TypeOfDeal typeOfDeal;

    @ManyToOne
    private TypeOfProperty typeOfProperty;

}
