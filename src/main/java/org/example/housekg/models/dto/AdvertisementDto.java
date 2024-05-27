package org.example.housekg.models.dto;

import jakarta.validation.constraints.NotNull;

public record AdvertisementDto(
        @NotNull(message = "numberOfRoomsId can not be null!")
        Long numberOfRoomsId,
        @NotNull(message = "seriesId can not be null!")
        Long seriesId,
        @NotNull(message = "typeOfBuildingId can not be null!")
        Long typeOfBuildingId,
        @NotNull(message = "stateId can not be null!")
        Long stateId,
        @NotNull(message = "typeOfDealId can not be null!")
        Long typeOfDealId,
        @NotNull(message = "typeOfPropertyId can not be null!")
        Long typeOfPropertyId,
        @NotNull(message = "residentialComplexId can not be null!")
        Long residentialComplexId,
        @NotNull(message = "paymentByInstalmentsId can not be null!")
        Long paymentByInstalmentsId,
        @NotNull(message = "mortgageId can not be null!")
        Long mortgageId,
        @NotNull(message = "possibilityOfExchangeId can not be null!")
        Long possibilityOfExchangeId,
        @NotNull(message = "heatingId can not be null!")
        Long heatingId
//        PriceDto priceDto,
        // TODO: ADD region, images
) {
}
