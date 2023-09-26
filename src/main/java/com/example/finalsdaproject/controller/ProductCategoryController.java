package com.example.finalsdaproject.controller;

import com.example.finalsdaproject.entity.ProductCategory;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product-categories")
public class ProductCategoryController {

    @GetMapping("/{id}")
    public ResponseEntity<ProductCategory> getProductCategoryId(@PathVariable Long id) {
        // Retrieve the productCategory by ID from your database or service
        ProductCategoryController productCategoryService = null;
        ProductCategory productCategory = productCategoryService.getProductCategoryId(id).getBody();

        if (productCategory != null) {
            return ResponseEntity.ok(productCategory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public String getName() {
        return "Product Category Not Found";
    }
}
