package com.weshop.WebschopIAC.repositories;


import com.weshop.WebschopIAC.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
