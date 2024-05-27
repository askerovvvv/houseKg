package org.example.housekg.mapper;

import org.example.housekg.models.dto.AdvertisementDto;
import org.example.housekg.models.entity.Advertisement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdvertisementMapper extends BaseMapper<Advertisement, AdvertisementDto>{

    @Override
    default AdvertisementDto toBaseDto(Advertisement baseEntity) {
        return new AdvertisementDto(
                baseEntity.getNumberOfRooms().getId(),
                baseEntity.getSeries().getId(),
                baseEntity.getTypeOfBuilding().getId(),
                baseEntity.getState().getId(),
                baseEntity.getTypeOfDeal().getId(),
                baseEntity.getTypeOfProperty().getId(),
                baseEntity.getResidentialComplex().getId(),
                baseEntity.getPaymentByInstalments().getId(),
                baseEntity.getMortgage().getId(),
                baseEntity.getPossibilityOfExchange().getId(),
                baseEntity.getHeating().getId()

        );
    }

}
