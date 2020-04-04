package com.weshop.WebschopIAC.controllers;

import com.weshop.WebschopIAC.domain.Discount;
import com.weshop.WebschopIAC.repositories.DiscountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/disc")
@RestController
public class DiscountResource {

    @Autowired
    private DiscountRepo discountRepo;

    @GetMapping("/all")
    public Iterable<Discount> getCustomers() {
        return discountRepo.findAll();
    }
}
