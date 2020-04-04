package com.weshop.WebschopIAC.services;

import com.weshop.WebschopIAC.domain.Bestelling;
import com.weshop.WebschopIAC.domain.Category;
import com.weshop.WebschopIAC.domain.Product;
import com.weshop.WebschopIAC.repositories.BestellingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class bestellingService {

    @Autowired
    private BestellingRepo bestellingRepo;

    public Optional<Bestelling> findByID(Long id) {
        return bestellingRepo.findById(id);
    }

    public Iterable<Bestelling> getAllBestellingen(){
        return bestellingRepo.findAll();
    }


}
