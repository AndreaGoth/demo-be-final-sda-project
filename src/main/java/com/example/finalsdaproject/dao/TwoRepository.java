package com.example.finalsdaproject.dao;

import com.example.finalsdaproject.entity.Two;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


    @RepositoryRestResource(collectionResourceRel = "two" , path = "two")
    public interface TwoRepository extends JpaRepository<Two, Long> {
}
