package com.example.finalsdaproject.dao;

import com.example.finalsdaproject.entity.Four;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "four" , path = "four")
public interface FourRepository extends JpaRepository<Four, Long> {

}
