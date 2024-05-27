package org.example.housekg.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.housekg.exceptions.CustomValidationException;
import org.example.housekg.mapper.AdvertisementMapper;
import org.example.housekg.models.dto.AdvertisementDto;
import org.example.housekg.models.dto.CustomValidationErrorDto;
import org.example.housekg.models.entity.*;
import org.example.housekg.repository.AdvertisementRepository;
import org.example.housekg.service.AdvertisementService;
import org.example.housekg.service.NumberOfRoomService;
import org.example.housekg.validator.CustomValidator;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdvertisementsServiceImpl implements AdvertisementService{

    private final AdvertisementRepository advertisementRepository;
    private final HeatingServiceImpl heatingService;
    private final NumberOfRoomService numberOfRoomService;
    private final SeriesServiceImpl seriesService;
    private final TypeOfBuildingServiceImpl typeOfBuildingService;
    private final StateServiceImpl stateService;
    private final TypeOfDealServiceImpl typeOfDealService;
    private final TypeOfPropertyServiceImpl typeOfPropertyService;
    private final ResidentialComplexServiceImpl residentialComplexService;
    private final PossibilityOfExchangeServiceImpl possibilityOfExchangeService;
    private final MortgageServiceImpl mortgageService;
    private final PaymentByInstalmentsServiceImpl paymentByInstalmentsService;
    private final AdvertisementMapper mapper;
    private final CustomValidator<AdvertisementDto> validator;

    //    private final PriceService typeOfPropertyService;


    @Override
    public List<AdvertisementDto> findAll(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);

        return advertisementRepository.findAll(pageable).getContent().stream()
                .map(mapper::toBaseDto)
                .toList();
    }

    @Override
    public String save(AdvertisementDto dto) {
        List<CustomValidationErrorDto> fieldErrors = validator.validate(dto);
        if (!fieldErrors.isEmpty()) throw new CustomValidationException("Fields exception", fieldErrors);

        Heating heating = heatingService.findByIdAndReturnEntity(dto.heatingId());
        NumberOfRoom numberOfRoom = numberOfRoomService.findNumberOfRoomByIdAndReturnEntity(dto.numberOfRoomsId());
        Series series = seriesService.findByIdAndReturnEntity(dto.seriesId());
        TypeOfBuilding typeOfBuilding = typeOfBuildingService.findByIdAndReturnEntity(dto.typeOfBuildingId());
        State state = stateService.findByIdAndReturnEntity(dto.stateId());
        TypeOfDeal typeOfDeal = typeOfDealService.findByIdAndReturnEntity(dto.typeOfDealId());
        TypeOfProperty typeOfProperty = typeOfPropertyService.findByIdAndReturnEntity(dto.typeOfPropertyId());
        ResidentialComplex residentialComplex = residentialComplexService.findByIdAndReturnEntity(dto.residentialComplexId());
        PossibilityOfExchange possibilityOfExchange = possibilityOfExchangeService.findByIdAndReturnEntity(dto.possibilityOfExchangeId());
        Mortgage mortgage = mortgageService.findById(dto.mortgageId());
        PaymentByInstalments paymentByInstalments = paymentByInstalmentsService.findById(dto.paymentByInstalmentsId());

        Advertisement advertisement = Advertisement.builder()
                .heating(heating)
                .numberOfRooms(numberOfRoom)
                .series(series)
                .state(state)
                .typeOfDeal(typeOfDeal)
                .typeOfBuilding(typeOfBuilding)
                .typeOfProperty(typeOfProperty)
                .residentialComplex(residentialComplex)
                .possibilityOfExchange(possibilityOfExchange)
                .mortgage(mortgage)
                .paymentByInstalments(paymentByInstalments)
                .build();

        advertisementRepository.save(advertisement);

        return "Advertisement save";
    }

}
