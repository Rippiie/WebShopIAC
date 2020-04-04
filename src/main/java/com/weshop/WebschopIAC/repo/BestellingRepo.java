package com.weshop.WebschopIAC.repo;


import com.weshop.WebschopIAC.model.Bestelling;
import org.springframework.data.repository.CrudRepository;

public interface BestellingRepo extends CrudRepository<Bestelling, Long> {
}
