package com.weshop.WebschopIAC.controllers;

import com.weshop.WebschopIAC.domain.Category;
import com.weshop.WebschopIAC.domain.Product;
import com.weshop.WebschopIAC.services.categoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RequestMapping("/category")
@RestController
public class CategoryResource {

    private final categoryService categoryService;


    public CategoryResource(com.weshop.WebschopIAC.services.categoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{id}")
    public Map getCategoryByID(@PathVariable Long id){
        Optional<Category> category = categoryService.findCategoryByID(id);

        if (category.isEmpty()) {
            Map map = new HashMap();
            map.put("", "Category does not exist.");
            Map result = new HashMap();
            result.put("Result: ", map);
            return result;
        }

        Map map = new HashMap();
        map.put("Description", category.get().getDescription());
        map.put("Producten", category.get().getProducten());
        Map result = new HashMap();
        result.put("Category with ID " + id, map);
        return result;
    }

    @GetMapping("")
    public Iterable<Category> getAllCategorys(){
        return categoryService.getAllProducts();
    }
}
