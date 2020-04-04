package com.weshop.WebschopIAC.resource;

import com.weshop.WebschopIAC.model.Discount;
import com.weshop.WebschopIAC.repo.DiscountRepo;
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
