package com.weshop.WebschopIAC.services;

import com.weshop.WebschopIAC.domain.Product;
import com.weshop.WebschopIAC.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class productService {

    @Autowired
    private ProductRepo productRepo;

    public Iterable<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Product createProduct(Product product){
        return productRepo.save(product);
    }

    public Product updateProduct(Product product){
        return productRepo.save(product);
    }

    public Optional<Product> findByID(Long id){
        return productRepo.findById(id);
    }
}
