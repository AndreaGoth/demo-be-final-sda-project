package com.example.finalsdaproject.dao;

import com.example.finalsdaproject.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

// Enable Cross-Origin Resource Sharing (CORS) for a specific origin
@CrossOrigin("http://localhost:4200")
// Expose this repository as a REST resource with specific path and collection name
@RepositoryRestResource(collectionResourceRel = "customerOrders" , path = "customerOrders")
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {

}
