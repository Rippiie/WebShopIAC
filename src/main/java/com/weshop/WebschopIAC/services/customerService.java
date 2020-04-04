package com.weshop.WebschopIAC.services;

import com.weshop.WebschopIAC.domain.Bestelling;
import com.weshop.WebschopIAC.domain.Customer;
import com.weshop.WebschopIAC.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class customerService {

    @Autowired
    private CustomerRepo customerRepo;

    public Optional<Customer> findByID(Long id) {
        return customerRepo.findById(id);
    }

    public Iterable<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }


}
