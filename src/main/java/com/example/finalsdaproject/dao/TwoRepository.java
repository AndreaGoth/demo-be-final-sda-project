package com.example.finalsdaproject.dao;

import com.example.finalsdaproject.entity.Doi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface DoiRepository {

    @RepositoryRestResource(collectionResourceRel = "doi" , path = "doi")
    public interface DoiRepository extends JpaRepository<Doi, Long> {
}
