package com.weshop.WebschopIAC.repo;

import com.weshop.WebschopIAC.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
}
