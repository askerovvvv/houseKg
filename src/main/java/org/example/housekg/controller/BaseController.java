package org.example.housekg.controller;

import org.example.housekg.service.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T, D, R, S extends BaseService<T, D, R>> {

    private final S service;

    protected BaseController(S service) {
        this.service = service;
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<D>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody D baseDto) {
        return ResponseEntity.status(HttpStatus.OK).body(service.save(baseDto));
    }

    @GetMapping("/get/by/id")
    public ResponseEntity<?> findById(@RequestParam("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @DeleteMapping("/delete/by/id")
    public ResponseEntity<?> deleteById(@RequestParam("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.deleteById(id));
    }

}
