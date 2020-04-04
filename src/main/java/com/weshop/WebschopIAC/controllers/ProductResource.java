package com.weshop.WebschopIAC.controllers;


import com.weshop.WebschopIAC.dto.productDto;
import com.weshop.WebschopIAC.domain.Product;
import com.weshop.WebschopIAC.services.productService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RequestMapping("/product")
@RestController
public class ProductResource {

    private final productService productService;

    public ProductResource(productService productService) {
        this.productService = productService;
    }


    //    @GetMapping("/{id}")
//    public Product getProductByID(@Valid @RequestBody ProductDTO productDTO, @PathVariable Long id) {
//        Optional<Product> product = productRepo.findById(id);
//
//        Product product1 = product.get();
//        product1.setDescription(productDTO.getName());
//        product1.setPrice(productDTO.getPrice());
//        return product1;
//    }//
    @GetMapping("/{id}")
    public Map getProductByID(@PathVariable Long id) {
        Optional<Product> product = productService.findByID(id);

        Map map = new HashMap();
        map.put("Description", product.get().getDescription());
        map.put("Price", product.get().getPrice());
        Map result = new HashMap();
        result.put("Product with ID " + id, map);
        return result;
    }

    @PostMapping("")
    public Product createProduct(@Valid @RequestBody productDto productDto){

        Product newProduct = new Product(
                productDto.getName(),
                productDto.getDescription(),
                productDto.getPrice(),
                productDto.getPhoto()
        );

        return productService.createProduct(newProduct);
    }

    @GetMapping("")
    public Iterable<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@Valid @RequestBody productDto productDto, @PathVariable Long id){
        Optional<Product> product = productService.findByID(id);

        if (product.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Product product1 = product.get();
        product1.setName(productDto.getName());
        product1.setDescription(productDto.getDescription());
        product1.setPhoto(productDto.getPhoto());
        product1.setPrice(productDto.getPrice());

        Product setProduct = productService.updateProduct(product1);
        return new ResponseEntity<Product>(setProduct, HttpStatus.OK);
    }

}
