package com.weshop.WebschopIAC.repositories;


import com.weshop.WebschopIAC.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address, Long> {
}
