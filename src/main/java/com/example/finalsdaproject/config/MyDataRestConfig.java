package com.example.finalsdaproject.config;


import com.example.finalsdaproject.entity.Country;
import com.example.finalsdaproject.entity.Product;
import com.example.finalsdaproject.entity.ProductCategory;
import com.example.finalsdaproject.entity.State;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
// first thing that's being configurated in the project
public class MyDataRestConfig implements RepositoryRestConfigurer {
    // implements = inherits different methods from -->>
    // -->> RepositoryRestConfigurer = we are interested in restricted access from certain types of requests

    // EntityManager from Hibernate JPA helps us interogate db
    private EntityManager entityManager;

    @Autowired
    // Autowired assures that the connection between the connection
    public MyDataRestConfig(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        // We override the method due to line 12 where we implement the RepositoryRestConfigurer
        // Use generate instead of writing (easier & quicker)

        // List containing restricted HTTP requests
        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
        // Restricting fundamental operetaions from CRUD which offers a security layer

        // Disable HTTP method for each Repository Resource: Product, ProductCategory, State, Country
        // Only leaves Get Product, Get ProductCategory, Get State, Get Country working
        disableHttpMethods(Product.class, config, theUnsupportedActions);
        disableHttpMethods(ProductCategory.class, config, theUnsupportedActions);
        disableHttpMethods(State.class, config, theUnsupportedActions);
        disableHttpMethods(Country.class, config, theUnsupportedActions);
    }

    // Declaring disabledHttpMethods below:
    private void disableHttpMethods(Class theClass, RepositoryRestConfiguration configuration, HttpMethod[] theUnsupportedAction) {
        configuration.getExposureConfiguration()
                .forDomainType(theClass)
                .withItemExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedAction))
                .withItemExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedAction));
    }
}