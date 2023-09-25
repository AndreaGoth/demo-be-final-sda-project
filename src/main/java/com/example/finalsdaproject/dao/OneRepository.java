package com.example.finalsdaproject.dao;

import com.example.finalsdaproject.entity.One;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "one" , path = "one")
public interface OneRepository extends JpaRepository<One, Long> {

}
