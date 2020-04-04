package com.weshop.WebschopIAC.repositories;


import com.weshop.WebschopIAC.domain.Bestelling;
import org.springframework.data.repository.CrudRepository;

public interface BestellingRepo extends CrudRepository<Bestelling, Long> {
}
