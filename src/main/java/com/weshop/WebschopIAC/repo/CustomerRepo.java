package com.weshop.WebschopIAC.repo;


import com.weshop.WebschopIAC.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
