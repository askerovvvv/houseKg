package org.example.housekg.controller;

import lombok.RequiredArgsConstructor;
import org.example.housekg.models.dto.AdvertisementDto;
import org.example.housekg.service.AdvertisementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/advertisement")
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    @GetMapping("/get/all")
    public ResponseEntity<?> findAll(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(advertisementService.findAll(
                pageNumber,
                pageSize));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody AdvertisementDto advertisementDto) {
        return ResponseEntity.status(HttpStatus.OK).body(advertisementService.save(advertisementDto));
    }

//    @GetMapping("/get/by/id")
//    public ResponseEntity<?> findById(@RequestParam("id") Long id) {
//        return ResponseEntity.status(HttpStatus.OK).body(advertisementService.findAll(
//                pageNumber,
//                pageSize));
//    }

}
