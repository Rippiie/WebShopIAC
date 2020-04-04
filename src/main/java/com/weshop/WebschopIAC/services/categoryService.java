package com.weshop.WebschopIAC.services;

import com.weshop.WebschopIAC.domain.Category;
import com.weshop.WebschopIAC.repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class categoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Optional<Category> findCategoryByID(Long id) {
        return categoryRepo.findById(id);
    }

    public Iterable<Category> getAllProducts(){
        return categoryRepo.findAll();
    }

}
