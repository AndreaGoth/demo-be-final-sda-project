package com.example.finalsdaproject.dao;

import com.example.finalsdaproject.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategories" , path = "productCategories")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
