package com.weshop.WebschopIAC.repositories;

import com.weshop.WebschopIAC.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepo extends CrudRepository<Product, Long> {
}
