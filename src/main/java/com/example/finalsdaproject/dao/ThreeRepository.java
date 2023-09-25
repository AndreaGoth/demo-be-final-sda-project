package com.example.finalsdaproject.dao;

import com.example.finalsdaproject.entity.Three;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "three" , path = "three")
public interface ThreeRepository extends JpaRepository<Three, Long> {

}
