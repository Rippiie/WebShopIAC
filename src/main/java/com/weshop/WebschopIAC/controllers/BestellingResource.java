package com.weshop.WebschopIAC.controllers;

import com.weshop.WebschopIAC.domain.Bestelling;
import com.weshop.WebschopIAC.services.bestellingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RequestMapping("order")
@RestController
public class BestellingResource {

    private final bestellingService bestellingService;


    public BestellingResource(com.weshop.WebschopIAC.services.bestellingService bestellingService) {
        this.bestellingService = bestellingService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bestelling> getBestellingByID(@PathVariable Long id){
        Optional<Bestelling> bestelling = bestellingService.findByID(id);

        if (bestelling.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bestelling.get(), HttpStatus.OK);
    }

    @GetMapping("")
    public Iterable<Bestelling> getAllBestellingen() {
        return bestellingService.getAllBestellingen();
    }
}
