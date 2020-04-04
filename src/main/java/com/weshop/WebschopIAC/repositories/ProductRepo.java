package com.weshop.WebschopIAC.repositories;

import com.weshop.WebschopIAC.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
}
