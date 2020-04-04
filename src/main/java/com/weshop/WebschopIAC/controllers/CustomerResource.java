package com.weshop.WebschopIAC.controllers;

import com.weshop.WebschopIAC.domain.Bestelling;
import com.weshop.WebschopIAC.domain.Customer;
import com.weshop.WebschopIAC.services.customerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/customer")
@RestController
public class CustomerResource {

    private final customerService customerService;


    public CustomerResource(com.weshop.WebschopIAC.services.customerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerByID(@PathVariable Long id){
        Optional<Customer> customer = customerService.findByID(id);

        if (customer.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer.get(), HttpStatus.OK);
    }

    @GetMapping("")
    public Iterable<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
